package org.lambdaandstream;


public class Calculator {

    public static void main(String[] args) {


        Functional add = (a, b) -> a + b;

        Functional multiply = (a, b) -> a * b;

        add.operation(1, 4);


    }




}
