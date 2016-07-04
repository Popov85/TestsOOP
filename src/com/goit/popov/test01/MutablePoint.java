package com.goit.popov.test01;

/**
 * Created by Андрей on 28.06.2016.
 */
public class MutablePoint {
        private double x;

        private double y;

        public MutablePoint(double x, double y) {
                this.x = x;
                this.y = y;
        }

        public double getX() {
                return x;
        }

        public double getY() {
                return y;
        }

        public void setY(double y) {
                this.y = y;
        }

        public void setX(double x) {
                this.x = x;
        }

        @Override
        public String toString() {
                return "("+this.x + "; "+ this.y+")";
        }
}
