# green-algorithms-team4

## How to use

### 1. run_code 폴더에 있는 Makefile 실행
```shell
make
```

### 2. run_process.sh 실행
```shell
sudo chmod 777 run_process.sh
./run_process.sh [file_path]
```
* chmod에서 에러 나면 sudo 빼거나 아래 코드 바로 실행해보기
* file_path : ./[path]
* 혹시 모르니 ./ 붙이기

### 3. result 확인

```shell
cat result
```

### 4. result
* [status = 1] [runtime(μs)] [peak memory usage(KB)]

### 5. 에러 코드
* (1) [status = 0] compile_error [error message] : 컴파일 에러, 메시지 확인하기
* (2) [status = 0] runtime_error : 런타임 에러, 메시지 없음
