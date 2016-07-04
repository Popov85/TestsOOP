package com.goit.popov.test01;

/**
 * Created by Андрей on 28.06.2016.
 */
public class ImmutablePoint {

        private final double x;

        private final double y;

        public ImmutablePoint(double x, double y) {
                this.x = x;
                this.y = y;
        }

        public double getX() {
                return x;
        }

        public double getY() {
                return y;
        }

        @Override
        public String toString() {
                return "("+this.x + "; "+ this.y+")";
        }
}
