package com.example.mathlib;

public class Calculator {
    /**
     * Calculates the area of a rectangle
     *
     * @param length length of the rectangle
     * @param width  width of the rectangle
     * @return area of the rectangle
     */
    public double calculateRectangleArea(double length, double width) {
        return MathOperations.multiply(length, width);
    }

    /**
     * Calculates the perimeter of a rectangle
     *
     * @param length length of the rectangle
     * @param width  width of the rectangle
     * @return perimeter of the rectangle
     */
    public double calculateRectanglePerimeter(double length, double width) {
        return MathOperations.multiply(2, MathOperations.add(length, width));
    }
}