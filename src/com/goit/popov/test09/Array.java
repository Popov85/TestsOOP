package com.goit.popov.test09;

/**
 * Created by Андрей on 14.08.2016.
 */
public class Array {
        public static void main(String[] args) {
                Object[] arr = new Object[2];
                Integer intdigit = new Integer(25);
                arr[0] = intdigit;
                String str = new String("Hello");
                arr[1] = str;
                for (Object elem: arr) {
                        Integer i = (Integer) elem;
                        System.out.println(i.intValue());
                }
        }
}
