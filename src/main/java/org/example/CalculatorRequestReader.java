package org.example;

import java.util.Scanner;

public class CalculatorRequestReader {

    public CalculatorRequest read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("계산할 숫자와 연산자를 입력해주세요. ex) 1 + 2");
        String result = scanner.nextLine();
        String[] parts = result.split(" ");
        return new CalculatorRequest(parts);
    }

}
