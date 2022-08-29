package com.platzi.javatests.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz comprobar = new FizzBuzz();

    @Test
    public void return_fizz_when_number_is_divisible_by_3() {
        assertEquals("FIZZ", comprobar.divisible(3));
        assertEquals("FIZZ", comprobar.divisible(3627));
        assertEquals("FIZZ", comprobar.divisible(2553));
    }

    @Test
    public void return_fizz_when_number_is_divisible_by_5() {
        assertEquals("BUZZ", comprobar.divisible(5));
        assertEquals("BUZZ", comprobar.divisible(32870));
        assertEquals("BUZZ", comprobar.divisible(10));
    }

    @Test
    public void return_fizzbuzz_when_number_is_divisible_by_3_and_5() {
        assertEquals("FIZZBUZZ", comprobar.divisible(15));
        assertEquals("FIZZBUZZ", comprobar.divisible(2550));
        assertEquals("FIZZBUZZ", comprobar.divisible(495));
    }

    @Test
    public void return_number_in_string_when_number_is_not_divisible_by_3_and_5() {
        assertEquals("7", comprobar.divisible(7));
        assertEquals("2", comprobar.divisible(2));
        assertEquals("16", comprobar.divisible(16));
    }
}