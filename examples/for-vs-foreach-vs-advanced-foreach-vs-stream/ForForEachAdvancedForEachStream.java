package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ForForEachAdvancedForEachStream {

    private static final List<Integer> list = new ArrayList<>();
    private static final int LIST_SIZE = 100000000;
    private static int MIN = Integer.MAX_VALUE;

    public static void init() {
        Random random = new Random();
        for (int i = 0; i < LIST_SIZE; i++) {
            list.add(random.nextInt());
        }
    }

    public static void forTest() {
        long beforeTime = System.currentTimeMillis();

        // main code
        MIN = Integer.MAX_VALUE;
        for (int i = 0; i < LIST_SIZE; i++) {
            if (list.get(i) < MIN) {
                MIN = list.get(i);
            }
        }
        System.out.println("걀과: " + MIN);
        // main code

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("실행 시간(milli seconds) : " + secDiffTime);

        // 메모리 사용량 계산
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(usedMemory + " bytes");
    }

    public static void forEachTest() {
        long beforeTime = System.currentTimeMillis();

        // main code
        MIN = Integer.MAX_VALUE;
        list.forEach(item -> {
            if (item < MIN) {
                MIN = item;
            }
        });
        // main code

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("실행 시간(milli seconds) : " + secDiffTime);

        // 메모리 사용량 계산
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(usedMemory + " bytes");
    }

    public static void advancedForEach() {
        long beforeTime = System.currentTimeMillis();

        // main code
        MIN = Integer.MAX_VALUE;
        for (int item : list) {
            if (item < MIN) {
                MIN = item;
            }
        }
        System.out.println("결과: " + MIN);
        // main code

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("실행 시간(milli seconds) : " + secDiffTime);

        // 메모리 사용량 계산
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(usedMemory + " bytes");
    }

    public static void streamTest() {
        long beforeTime = System.currentTimeMillis();

        // main code
        MIN = Integer.MAX_VALUE;
        list.stream().forEach(item -> {
            if (item < MIN) {
                MIN = item;
            }
        });
        System.out.println("결과: " + MIN);
        // main code

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("실행 시간(milli seconds) : " + secDiffTime);

        // 메모리 사용량 계산
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(usedMemory + " bytes");
    }

    public static void main(String[] args) {
        init();
        System.gc();
        forTest();
        System.gc();
        forEachTest();
        System.gc();
        advancedForEach();
        System.gc();
        streamTest();
    }
}
