package com.platzi.javatests.fizzbuzz;

public class FizzBuzz {

    public String divisible(int num) {
        if (num % 3 == 0 && num % 5 == 0) return "FIZZBUZZ";
        if (num % 3 == 0) return "FIZZ";
        if (num % 5 == 0) return "BUZZ";
        return String.valueOf(num);
    }
}
