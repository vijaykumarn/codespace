package com.example.mathlib;

import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class Calculator {
    private final int precision;

    public Calculator() {
        this.precision = 2; // Default precision
    }

    public Calculator(int precision) {
        this.precision = precision;
    }

    public double calculateRectangleArea(double length, double width) {
        BigDecimal result = BigDecimal.valueOf(length)
            .multiply(BigDecimal.valueOf(width))
            .setScale(precision, RoundingMode.HALF_UP);
        return result.doubleValue();
    }

    public double calculateRectanglePerimeter(double length, double width) {
        BigDecimal result = BigDecimal.valueOf(2)
            .multiply(BigDecimal.valueOf(length).add(BigDecimal.valueOf(width)))
            .setScale(precision, RoundingMode.HALF_UP);
        return result.doubleValue();
    }
}