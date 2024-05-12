package org.example;

public class InvalidOperatorException extends RuntimeException{

    public InvalidOperatorException() {
        super("잘못된 연산자 입니다. +, -, *, / 중 하나를 선택하셔야 합니다.");
    }
}
