package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int[] month31 = {1, 3, 5, 7, 8, 10, 12};
        if (year <= 0 || month <= 0 || month > 12) {
            System.out.println("invalid date");
        } else {
            for (int monthNumber : month31) {
                if (month == monthNumber) {
                    System.out.println("31");
                    break;
                }
            }
            if (month == 2) {
                if (year % 4 == 0 && year % 100 != 0) {
                    System.out.println("29");
                } else if (year % 4 == 0 && year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("29");
                    } else {
                        System.out.println("28");
                    }
                } else {
                    System.out.println("28");
                }
            }
            else {
                System.out.println("30");
            }
        }
    }
}