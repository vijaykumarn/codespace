package com.example.geometryservice;

import com.example.mathlib.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GeometryService {

    private static final Logger logger = LoggerFactory.getLogger(GeometryService.class);

    private final Calculator calculator;

    public GeometryService(Calculator calculator) {
        this.calculator = calculator;
    }

    public double getRectangleArea(double length, double width) {
        return calculator.calculateRectangleArea(length, width);
    }

    public double getRectanglePerimeter(double length, double width) {
        return calculator.calculateRectanglePerimeter(length, width);
    }
}