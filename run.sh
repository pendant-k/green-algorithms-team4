#!/bin/bash

input_path="$1"
result="$input_path/result.txt"
rm -f $result

test=1
if [ "$#" -eq 2 ]; then
    test=$2
fi

files=("$input_path/Before" "$input_path/After")
for file in "${files[@]}"; do
    # 컴파일
    compile_result=$(javac -d . "$file.java" 2>&1)
    if [ $? -ne 0 ]; then
        # 컴파일 에러 발생
        echo "0 compile_error $compile_result"
        exit 1
    fi

    for ((i = 1; i <= $test; i++)); do
        # 실행 및 결과 분석
        opt=$(basename "$file")
        run_result=$(./run_code/exec "$opt")
        IFS=' ' read -r status_code result_type result_message <<< "$run_result"
        
        # status code에 따른 분기
        # if [ "$status_code" -eq 1 ]; then
        #     # status code가 1인 경우
        #     echo "$(./calculate "$runtime" "$memory_usage")" > emission
        # fi

        # 결과 저장
        echo -e "$opt:\t$status_code $result_type $result_message" | tee -a $result
    done
done
rm *.class