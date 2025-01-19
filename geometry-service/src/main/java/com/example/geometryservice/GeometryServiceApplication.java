package com.example.geometryservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.geometryservice", "com.example.mathlib"})
public class GeometryServiceApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(GeometryServiceApplication.class);
    private final GeometryService geometryService;

    public GeometryServiceApplication(GeometryService geometryService) {
        this.geometryService = geometryService;
    }

    public static void main(String[] args) {
        SpringApplication.run(GeometryServiceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        try {
            if (args.length < 2) {
                logger.error("Please provide two numbers as arguments: length and width");
                return;
            }

            double length = Double.parseDouble(args[0]);
            double width = Double.parseDouble(args[1]);

            if (length <= 0 || width <= 0) {
                logger.error("Length and width must be positive numbers");
                return;
            }

            double area = geometryService.getRectangleArea(length, width);
            double perimeter = geometryService.getRectanglePerimeter(length, width);

            logger.info("Rectangle Dimensions: {} x {}", length, width);
            logger.info("Area: {}", area);
            logger.info("Perimeter: {}", perimeter);

        } catch (NumberFormatException e) {
            logger.error("Invalid input. Please provide valid numbers for length and width", e);
        } catch (Exception e) {
            logger.error("An error occurred while calculating", e);
        }
    }
}