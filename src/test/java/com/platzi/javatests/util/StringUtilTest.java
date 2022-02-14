package com.platzi.javatests.util;


public class StringUtilTest {
    public static void main(String[] args) {

        assertEquals(StringUtil.repeat("hola", 3), "holaholahola");
        //System.out.println(result);
        /*
        if (!result.equals("holaholahola"))
            //System.out.println("Error");
            throw new RuntimeException("ERROR");
        else
            System.out.println("Ok")

         */
        assertEquals(StringUtil.repeat("hola", 1), "hola");
        /*
        System.out.println(result2);
        if (!result2.equals("hola"))
            //System.out.println("ERROR");
            throw new RuntimeException("ERROR");

         */
    }

    private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected))
            //System.out.println("Error");
            throw new RuntimeException(actual + " is not equal to expected " + expected);
        else
            System.out.println("Ok");
    }

}