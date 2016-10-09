package com.goit.popov.test14Object;

/**
 * Created by Andrey on 10/4/2016.
 */
public class Test {
        public static void main(String[] args) {
                User s = new User("Andrey",56564454);
                User s1 = new User("Andrey",56564454);
                /*Object s = new Object();
                Object s1 = new Object();*/
                System.out.println(s+" / "+s1);
                System.out.println(s.equals(s1));
                System.out.println(s.hashCode()+" / "+s1.hashCode());
        }
}
