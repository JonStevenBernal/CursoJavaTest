package com.platzi.javatests.NumerosRomanos;

public class RomanNumerals {
    public static String arabicToRoman(int n) {
        int i = 0;
        String result = "";
        while (i< n){
            if (n-i >= 1000){
                result += "M";
                i+=1000;
                continue;
            }
            if (n-i >= 500){
                result += "D";
                i+=500;
                continue;
            }
            if (n-i >= 100){
                result += "C";
                i+=100;
                continue;
            }
            if (n-i >= 50){
                result += "L";
                i+=50;
                continue;
            }
            if (n-i >= 10){
                result += "X";
                i+=10;
                continue;
            }
            if (n-i >= 5){
                result += "V";
                i+=5;
                continue;
            }
            result += "I";
            i++;
        }
        return result;
    }
}
