package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        // 6 and 7 - 0110 and 0111
        first ^= second;
        second = first ^ second;
        first ^= second;
        System.out.println(first);
        System.out.println(second);
    }
}