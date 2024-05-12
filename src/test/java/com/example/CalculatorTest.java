package com.example;

import org.assertj.core.api.Assertions;
import org.example.Calculator;
import org.example.InvalidOperatorException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void 덧셈_연산() {
        // given
        long num1 = 2;
        String operator = "+";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        Assert.assertEquals(5, result);
        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    public void 곱셈_연산() {
        // given
        long num1 = 2;
        String operator = "*";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        Assert.assertEquals(6, result);
        Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    public void 뺄셈_연산() {
        // given
        long num1 = 2;
        String operator = "-";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        Assert.assertEquals(-1, result);
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void 나눗셈_연산() {
        // given
        long num1 = 6;
        String operator = "/";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        Assert.assertEquals(2, result);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void 잘못된_연산자가_들어왔을_경우() {
        // given
        long num1 = 2;
        String operator = "x";
        long num2 = 3;
        Calculator calculator = new Calculator();

        // when
        // then
        Assert.assertThrows(InvalidOperatorException.class, () -> {
            calculator.calculate(num1, operator, num2);
        });
    }
}
