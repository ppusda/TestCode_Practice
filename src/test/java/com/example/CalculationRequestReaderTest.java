package com.example;

import java.io.ByteArrayInputStream;
import org.example.CalculatorRequest;
import org.example.CalculatorRequestReader;
import org.junit.Assert;
import org.junit.Test;

public class CalculationRequestReaderTest {

    @Test
    public void 데이터를_읽어들일_수_있다() {
        // given
        CalculatorRequestReader calculatorRequestReader = new CalculatorRequestReader();

        // when
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes()));
        CalculatorRequest result = calculatorRequestReader.read();

        // then
        Assert.assertEquals(2, result.getNum1());
        Assert.assertEquals("+", result.getOperator());
        Assert.assertEquals(3, result.getNum2());
    }
}
