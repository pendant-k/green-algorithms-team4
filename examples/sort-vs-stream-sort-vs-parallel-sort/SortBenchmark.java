package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SortBenchmark {
    private static final int N = 50000000;
    private static final List<Integer> testData = new ArrayList<>();

    public static List<Integer> setup() {
        Random randomGenerator = new Random();
        for (int i = 0; i < N; i++) {
            testData.add(randomGenerator.nextInt(Integer.MAX_VALUE));
        }
        return testData;
    }

    public static void classicSort() {

        long beforeTime = System.currentTimeMillis();

        List<Integer> copy = new ArrayList<>(testData);
        Collections.sort(copy);

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("실행 시간(milli seconds) : " + secDiffTime);

        // 메모리 사용량 계산
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(usedMemory + " bytes");
    }

    public static void standardSort() {

        long beforeTime = System.currentTimeMillis();

        testData.stream().sorted().collect(Collectors.toList());

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("실행 시간(milli seconds) : " + secDiffTime);

        // 메모리 사용량 계산
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(usedMemory + " bytes");
    }

    public static void parallelSort() {

        long beforeTime = System.currentTimeMillis();

        testData.parallelStream().sorted().collect(Collectors.toList());


        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("실행 시간(milli seconds) : " + secDiffTime);

        // 메모리 사용량 계산
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(usedMemory + " bytes");
    }


    public static void main(String[] args) {
        setup();
        System.gc();
        classicSort();
        System.gc();
        standardSort();
        System.gc();
        parallelSort();
    }
}