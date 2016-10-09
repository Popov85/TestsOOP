package com.goit.popov.test15BigInt;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Andrey on 10/4/2016.
 */
public class Test {
        public static void main(String[] args) {
                int intVal = 1999999998;
                int intVal2 = 1999999998;
                int res = intVal+intVal2;
                System.out.println(res);
                BigInteger n = new BigInteger("48484848484864545645645454544445454545");
                System.out.println(n.multiply(new BigInteger("565")));
        }
}
