package com.example.mathlib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final com.example.mathlib.Calculator calculator = new com.example.mathlib.Calculator();

    @Test
    void testRectangleArea() {
        assertEquals(20.0, calculator.calculateRectangleArea(4.0, 5.0),
                "Rectangle area calculation should work correctly");
    }

    @Test
    void testRectanglePerimeter() {
        assertEquals(18.0, calculator.calculateRectanglePerimeter(4.0, 5.0),
                "Rectangle perimeter calculation should work correctly");
    }
}