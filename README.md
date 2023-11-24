# green-algorithms-team4

## How to use run_process.sh

### 1. run_code 폴더에 있는 Makefile 실행
```shell
cd run_code
make
```

### 2. run_process.sh 실행
```shell
chmod 777 run_process.sh
./run_process.sh [file_path]
```
* chmod에서 에러 나면 앞에 sudo 붙이거나 2번째 줄 코드 바로 실행해보기
  * sudo chmod 777 run_process.sh
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

### 6. Example
![image](https://github.com/pendant-k/green-algorithms-team4/assets/81512592/3fc4c13f-31ea-44c4-9acc-f11f22e12d88)


## How to use run.sh

```bash
cd run_code && make exec
cd ..

./run.sh examples/{optimization}
./run.sh examples/{optimization} {number} # run repeatedly for {number} times
```
