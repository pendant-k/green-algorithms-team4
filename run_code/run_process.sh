#!/bin/bash


# 1. input file path를 argument로 넘겨 받고 file path 변수에 저장하기
# input_file="./input.java"
input_file="$1"


# 2. java compile 명령어를 실행하고, compile error 확인하기
compile_result=$(javac "$input_file" 2>&1)

if [ $? -ne 0 ]; then
    # 컴파일 에러가 발생한 경우
    echo "0 compile_error $compile_result"
    exit 1
fi


# 3. compile error가 없다면 ./run 에 컴파일된 파일을 argument를 넘겨주어서 실행하기
class_file="./input.class"
# class_file="${input_file%.java}.class"


# 4. ./run의 결과를 space 단위로 split해 세 변수에 저장하기
run_result=$(./run "$class_file")

IFS=' ' read -r status_code result_type result_message <<< "$run_result"

# 5. status code에 따른 분기
if [ "$status_code" -eq 1 ]; then
    # status code가 1인 경우
    echo "$(./calculate "$runtime" "$memory_usage")" > emission
fi


# 6. 결과 저장
echo "$status_code $result_type $result_message" > result
cat result
rm $execute_file