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
    int iter = argc == 3 ? atoi(argv[2]) : 1;
    long total_runtime = 0, total_memusage = 0;
    
    for (int i = 0; i < iter; i ++) {

        child_pid = fork();
        if (child_pid == -1) {
            perror("fork");
            exit(1);
        }

        if (child_pid == 0) {
            // 자식 프로세스 코드
            // 여기에서 실행할 파일을 지정하고 실행
            printf("child enter: %s\n", argv[1]);

            char* child_argv[] = { "java", argv[1], NULL };
            // printf("%s\n", child_argv[0]);
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

            // printf("1 %ld %ld", ru_child.ru_utime.tv_usec + ru_child.ru_stime.tv_usec, ru_child.ru_maxrss);
            total_runtime += ru_child.ru_utime.tv_usec + ru_child.ru_stime.tv_usec;
            total_memusage += ru_child.ru_maxrss;
        }
    }

    printf("1 %ld %ld", total_runtime /= iter, total_memusage /= iter);

    return 0;
}
