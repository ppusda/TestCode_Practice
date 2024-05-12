package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CalculatorRequest calculatorRequest = new CalculatorRequestReader().read();
        long answer = new Calculator().calculate(
                calculatorRequest.getNum1(),
                calculatorRequest.getOperator(),
                calculatorRequest.getNum2()
        );
        System.out.println(answer);
    }
}