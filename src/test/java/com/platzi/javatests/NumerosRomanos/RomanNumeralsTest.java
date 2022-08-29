package com.platzi.javatests.NumerosRomanos;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {
    @Test
    public void number_roman_less_equal_3() {
        assertEquals("I", RomanNumerals.arabicToRoman(1));
        assertEquals("II", RomanNumerals.arabicToRoman(2));
        assertEquals("III", RomanNumerals.arabicToRoman(3));
    }

    @Test
    public void number_roman_5_by_7() {
        assertEquals("V", RomanNumerals.arabicToRoman(5));
        assertEquals("VI", RomanNumerals.arabicToRoman(6));
        assertEquals("VII", RomanNumerals.arabicToRoman(7));
    }
    @Test
    public void number_roman_10_by_11() {
        assertEquals("X", RomanNumerals.arabicToRoman(10));
        assertEquals("XI", RomanNumerals.arabicToRoman(11));
    }

    @Test
    public void number_roman_15_by_16() {
        assertEquals("XV", RomanNumerals.arabicToRoman(15));
        assertEquals("XVI", RomanNumerals.arabicToRoman(16));
    }

    @Test
    public void number_roman_50_by_51() {
        assertEquals("L", RomanNumerals.arabicToRoman(50));
        assertEquals("LI", RomanNumerals.arabicToRoman(51));
    }
    @Test
    public void number_roman_55_by_57() {
        assertEquals("LV", RomanNumerals.arabicToRoman(55));
        assertEquals("LVI", RomanNumerals.arabicToRoman(56));
    }

    @Test
    public void number_roman_60_by_80_in_10() {
        assertEquals("LX", RomanNumerals.arabicToRoman(60));
        assertEquals("LXX", RomanNumerals.arabicToRoman(70));
        assertEquals("LXXX", RomanNumerals.arabicToRoman(80));
    }
    @Test
    public void number_roman_81_85_86() {
        assertEquals("LXXXI", RomanNumerals.arabicToRoman(81));
        assertEquals("LXXXV", RomanNumerals.arabicToRoman(85));
        assertEquals("LXXXVI", RomanNumerals.arabicToRoman(86));
    }
    @Test
    public void number_roman_126() {
        assertEquals("CXXVI", RomanNumerals.arabicToRoman(126));
    }
    @Test
    public void number_roman_2507() {
        assertEquals("MMDVII", RomanNumerals.arabicToRoman(2507));
    }

}