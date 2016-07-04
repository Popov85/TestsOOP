package com.goit.popov.test02;

/**
 * Static factory
 */
public class RectangleV4 {

        private static RectangleV4 rectangle;

        private final double side1;
        private final double side2;

        private RectangleV4(double side1, double side2){
                this.side1 = side1;
                this.side2 = side2;
        }

        public static final RectangleV4 getInstance(double side1, double side2) {
                return new RectangleV4(side1, side2);
        }

        public final double calculateArea() {
                return this.side1*this.side2;
        }
}
