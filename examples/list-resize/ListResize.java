package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListResize {

    private static final int ARRAY_SIZE = 10000000;

    public static void fixSizedArrayList() {
        long beforeTime = System.currentTimeMillis();


        List<String> list = new ArrayList<>(ARRAY_SIZE);
        for(int i=0; i < ARRAY_SIZE; i++) {
            list.add("example");
        }

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("실행 시간(milli seconds) : " + secDiffTime);

        // 메모리 사용량 계산
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(usedMemory + " bytes");
    }

    public static void dynamicResizedArrayList() {

        long beforeTime = System.currentTimeMillis();

        // main code
        List<String> list = new ArrayList<>();
        for(int i=0; i < ARRAY_SIZE; i++) {
            list.add("example");
        }
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

        fixSizedArrayList();
        System.gc();
        dynamicResizedArrayList();
    }
}
