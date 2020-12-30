package com.epam.rd.java.basic.practice6.part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Part2 {
    protected static final List<Integer> arrayList = new ArrayList<>();
    protected static final List<Integer> linkedList = new LinkedList<>();
    public static final int K = 4;
    public static final int CAPACITY = 10_000;

    public static void main(String[] args) {
        fill(CAPACITY, arrayList);
        System.out.println("ArrayList#Index: " + removeByIndex(arrayList, K) + " ms");
        System.out.println("LinkedList#Index: " + removeByIndex(linkedList, K) + " ms");
        fill(CAPACITY, linkedList);
        System.out.println("ArrayList#Iterator: " + removeByIterator(arrayList, K) + " ms");
        System.out.println("LinkedList#Iterator: " + removeByIterator(linkedList, K) + " ms");
    }

    public static long removeByIndex(final List<Integer> list, final int k) {
        long start = System.currentTimeMillis();

        int technicalVariable = k - 1;
        int i;

        for (i = technicalVariable; list.size() > 1; ) {
            list.remove(i);
            i = ((i + technicalVariable) % list.size());
        }

        return System.currentTimeMillis() - start;
    }

    public static long removeByIterator(final List<Integer> list, int k) {
        long start = System.currentTimeMillis();

        int tmpIndex = 0;

        while(!list.isEmpty()){
            Iterator<Integer> iterator = list.iterator();

            tmpIndex+=k;

            while (tmpIndex > list.size()) { tmpIndex -= list.size(); }

            int iterIndex = tmpIndex;
            while (iterIndex>0){
                iterator.next();
                iterIndex--;
            }
            iterator.remove();
            tmpIndex--;
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    public static List<Integer> fill(int n, List<Integer> list) {
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        return list;
    }
}