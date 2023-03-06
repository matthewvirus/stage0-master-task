package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        String current = "1";
        int spaces = cathetusLength;
        for (int i = 2; i <= cathetusLength + 1; ++i) {
            printSpace(spaces--);
            System.out.println(current);
            current = i + current + i;
        }
    }

    private static void printSpace(int times) {
        for (int j = 0; j < times - 1; j++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}