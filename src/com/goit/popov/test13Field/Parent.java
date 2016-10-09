package com.goit.popov.test13Field;

/**
 * Created by Andrey on 10/3/2016.
 */
public class Parent {
        public static void main(String[] args) {
                new Test().a = 1;
                Test test = new Test();
                test.a = 5;
                System.out.println(test.a);
        }
}
