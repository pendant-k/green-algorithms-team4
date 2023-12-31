# green-algorithms-team4

## How to use run_process.sh : 실행 결과 n번 평균 내기

### 1. run_code 폴더에 있는 Makefile 실행
```shell
cd run_code
make
```

### 2. run_process.sh 실행
```shell
chmod 777 run_process.sh
./run_process.sh [file_path] [iteration_number]
```
* 해당 path의 result_mean_[iteration_number].txt에 저장됨
* iteration_number를 입력하지 않으면 result.txt에 저장

### 3. result format
* [status = 1] [mean_runtime(.6s)] [mean_peak memory usage(KB)]

### 4. 에러 코드
* (1) [status = 0] compile_error [error message] : 컴파일 에러, 메시지 확인하기
* (2) [status = 0] runtime_error : 런타임 에러, 메시지 없음

### 5. Example
![image](https://github.com/pendant-k/green-algorithms-team4/assets/81512592/1765537d-6558-42ee-8b3e-9a801809c801)



## How to use run.sh

```bash
cd run_code && make exec
cd ..

./run.sh examples/{optimization}
./run.sh examples/{optimization} {number} # run repeatedly for {number} times
```
