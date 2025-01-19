package com.example.mathlib;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Calculator.class)
class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    void testRectangleArea() {
        assertEquals(20.00, calculator.calculateRectangleArea(4.0, 5.0), 0.01);
    }

    @Test
    void testRectanglePerimeter() {
        assertEquals(18.00, calculator.calculateRectanglePerimeter(4.0, 5.0), 0.01);
    }
}