package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.io.ByteArrayInputStream;
import org.example.BadRequestException;
import org.example.CalculatorRequest;
import org.example.CalculatorRequestReader;
import org.example.InvalidOperatorException;
import org.junit.Assert;
import org.junit.Test;

public class CalculationRequestTest {

    @Test
    public void 유효한_숫자를_파싱() {
        // given
        String[] parts = new String[]{"2", "+", "3"};

        // when
        CalculatorRequest calculatorRequest = new CalculatorRequest(parts);

        // then
        assertEquals(2, calculatorRequest.getNum1());
        assertEquals("+", calculatorRequest.getOperator());
        assertEquals(3, calculatorRequest.getNum2());
    }

    @Test
    public void 세자리_숫자가_넘어가는_상황_파싱() {
        // given
        String[] parts = new String[]{"234", "+", "324"};

        // when
        CalculatorRequest calculatorRequest = new CalculatorRequest(parts);

        // then
        assertEquals(234, calculatorRequest.getNum1());
        assertEquals("+", calculatorRequest.getOperator());
        assertEquals(324, calculatorRequest.getNum2());
    }

    @Test
    public void 유효한_길이의_파츠가_들어오지_않으면_에러 () {
        // given
        String[] parts = new String[]{"234", "+"};

        // when
        // then
        assertThrows(BadRequestException.class, () -> {
            new CalculatorRequest(parts);
        });
    }

    @Test
    public void 유효하지_않은_연산자가_들어오면_에러 () {
        // given
        String[] parts = new String[]{"2", "_", "3"};

        // when
        // then
        assertThrows(InvalidOperatorException.class, () -> {
            new CalculatorRequest(parts);
        });
    }

    @Test
    public void 유효하지_않은_길이의_연산자가_들어오면_에러 () {
        // given
        String[] parts = new String[]{"2", "++", "3"};

        // when
        // then
        assertThrows(InvalidOperatorException.class, () -> {
            new CalculatorRequest(parts);
        });
    }
}
