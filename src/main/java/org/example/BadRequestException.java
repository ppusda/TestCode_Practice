package org.example;

public class BadRequestException extends RuntimeException{

    public BadRequestException() {
        super("잘못된 입력 값 입니다.");
    }
}
