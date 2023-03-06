package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        String current = "*";
        int spaces = cathetusLength;
        for (int i = 2; i <= cathetusLength + 1; ++i) {
            printSpace(spaces--);
            System.out.println(current);
            current = "*" + current;
        }
    }

    private static void printSpace(int times) {
        for (int j = 0; j < times - 1; j++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}