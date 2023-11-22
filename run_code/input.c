#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

#include <fcntl.h>
#include <sys/mman.h>
#include <sys/stat.h>
#include <sys/types.h>

int main(int argc, char* argv[])
{
    int _size = 1024 * 1024 * 1024;
    char* p = (char*)malloc(_size);

    // mmap를 이용해서 열린 파일을 메모리에 대응시킨다.
    // file은 대응된 주소를 가리키고, file을 이용해서 필요한 작업을
    // 하면 된다.
    memset(p, 0x00, _size);

    for (int i = 0; i < _size; i++) {
        p[i] = i % 0xff;
    }

    // while (1)
    //     ;

    free(p);
    return 0;
}