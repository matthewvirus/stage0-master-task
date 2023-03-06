package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        System.out.println(Integer.valueOf(
                new StringBuilder()
                        .append(number)
                        .reverse()
                        .toString()
        ));
    }
}