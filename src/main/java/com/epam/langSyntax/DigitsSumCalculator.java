package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        char[] numbers = Integer.toString(number).toCharArray();
        int sum = 0;
        for (char num: numbers) {
            sum += Integer.parseInt(String.valueOf(num));
        }
        System.out.println(sum);
    }
}