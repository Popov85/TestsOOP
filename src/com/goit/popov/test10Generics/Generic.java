package com.goit.popov.test10Generics;

/**
 * Created by Андрей on 16.08.2016.
 */
public class Generic {
        public static void main(String[] args) {
                Number[] intNumbers = new Integer[]{10, 20, 30};
                intNumbers[2] = 10.48;
                for (Number intNumber : intNumbers) {
                        System.out.println(intNumber);
                }
        }
}
