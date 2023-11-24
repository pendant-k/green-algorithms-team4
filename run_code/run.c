#include <stdio.h>
#include <stdlib.h>
#include <sys/resource.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int main(int argc, char* argv[])
{
    pid_t child_pid;
    int status;

    child_pid = fork();
    if (child_pid == -1) {
        perror("fork");
        exit(1);
    }

    if (child_pid == 0) {
        // 자식 프로세스 코드
        // 여기에서 실행할 파일을 지정하고 실행

        char* child_argv[] = { "java", argv[1], NULL };
        execvp(child_argv[0], child_argv);

        // // execvp가 실패했을 때 실행되는 코드
        perror("execvp");

        // is it reachable?
        char cmd[32];
        sprintf(cmd, "cat /proc/%d/status", getpid());
        system(cmd);

        printf("child end: %d\n", getpid());
        exit(1);
    } else {
        // 부모 프로세스 코드
        // 자식 프로세스의 종료를 기다림
        struct rusage ru_child, ru_parent;

        wait4(child_pid, &status, 0, &ru_child);
        getrusage(RUSAGE_SELF, &ru_parent);

        if (!WIFEXITED(status)) {
            printf("0 runtime_error\n");
            exit(1);
        }

        // maximum physical memory usage
        // printf("child: %ld, parent: %ld\n", ru_child.ru_maxrss, ru_parent.ru_maxrss);

        // child process rumtime (us)
        // printf("utime: %ld, stime: %ld\n", ru_child.ru_utime.tv_usec, ru_child.ru_stime.tv_usec);

        printf("1 %ld %ld", ru_child.ru_utime.tv_usec + ru_child.ru_stime.tv_usec, ru_child.ru_maxrss);
    }

    return 0;
}
