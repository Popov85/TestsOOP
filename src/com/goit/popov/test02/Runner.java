package com.goit.popov.test02;

/**
 * Demonstrates the usage of all Rectangle classes
 */
public class Runner {

        public static void main (String[] args) {

                // Static method
                System.out.println("V1: Area = "+RectangleV1.calculateArea(2,2));

                // Default constructor
                System.out.println("V2: Area = "+new RectangleV2().calculateArea(2,2));

                // Custom constructor
                System.out.println("V3: Area = "+new RectangleV3(2,2).calculateArea());

                // Static factory
                System.out.println("V4: Area = "+RectangleV4.getInstance(2,2).calculateArea());
        }
}
