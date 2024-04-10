package org.learning.javacalculatortester;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void init() {
    calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(5.5, calculator.add(3,2.5f),0.09);
        assertEquals(3, calculator.add(5,-2),0.09);
        assertEquals(-4.5, calculator.add(-2,-2.5f),0.09);
    }

    @Test
    void subtract() {
        assertEquals(0.8, calculator.subtract(3,2.2f), 0.09);
        assertEquals(7.5, calculator.subtract(5,-2.5f), 0.09);
        assertEquals(-2.5, calculator.subtract(-5,-2.5f), 0.09);
    }

    @Test
    void divide() {
        assertEquals(5, calculator.divide(10,2), 0.009);
        assertEquals(2, calculator.divide(10/2.5f,2), 0.009);
        assertEquals(-5, calculator.divide(-10,2), 0.009);
    }

    @Test
    void divideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(2,0));
        System.out.println("Dividing by zero successfully throws IllegalArgumentException");
    }

    @Test
    void multiply() {
        assertEquals(25, calculator.multiply(10,2.5f), 0.009);
        assertEquals(-20, calculator.multiply(10,-2), 0.009);
        assertEquals(20, calculator.multiply(-10,-2), 0.009);
    }
}