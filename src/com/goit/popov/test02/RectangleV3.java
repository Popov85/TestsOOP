package com.goit.popov.test02;

/**
 * Created by Андрей on 30.06.2016.
 */
public class RectangleV3 {

        private final double side1;
        private final double side2;

        public RectangleV3(double side1, double side2) {
                this.side1 = side1;
                this.side2 = side2;
        }

        public final double calculateArea() {
                return this.side1*this.side2;
        }
}
