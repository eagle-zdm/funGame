package com.myCompany;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunGameTest {
    private static FunGame funGame = new FunGame();


    @Test
    public void testFizzAndBuzzGame() {
        assertEquals("1", funGame.fizzAndBuzzGame(1)); // only number
        assertEquals("Fizz", funGame.fizzAndBuzzGame(3)); // divisible by 3
        assertEquals("Fizz", funGame.fizzAndBuzzGame(6)); // divisible by 3
        assertEquals("4", funGame.fizzAndBuzzGame(4));// not divisible by 3
        assertEquals("Buzz", funGame.fizzAndBuzzGame(5));// divisible by 5
        assertEquals("Buzz", funGame.fizzAndBuzzGame(10)); // divisible by 5
        assertEquals("FizzBuzz", funGame.fizzAndBuzzGame(15)); // divisible by 3 and 5
        assertEquals("19", funGame.fizzAndBuzzGame(19)); // not divisible by 3 and 5
        assertEquals("onley 1-100 is accepted.", funGame.fizzAndBuzzGame(0));
        assertEquals("onley 1-100 is accepted.", funGame.fizzAndBuzzGame(101));
    }

    @Test
    public void testFizzAndBuzzNewGame() {

        assertEquals("onley 1-100 is accepted.", funGame.fizzAndBuzzNewGame(0));
        assertEquals("onley 1-100 is accepted.", funGame.fizzAndBuzzNewGame(101));

        assertEquals("1", funGame.fizzAndBuzzNewGame(1)); // only number
        assertEquals("Fizz", funGame.fizzAndBuzzNewGame(3)); // has 3 and divisible
        assertEquals("Fizz", funGame.fizzAndBuzzNewGame(13)); // has 3 and not divisible
        assertEquals("Fizz", funGame.fizzAndBuzzNewGame(6)); // don't have 3 and divisible
        assertEquals("17", funGame.fizzAndBuzzNewGame(17)); // don't have 3 and not divisible

        assertEquals("Buzz", funGame.fizzAndBuzzNewGame(15)); // has 5 and divisible
        assertEquals("Buzz", funGame.fizzAndBuzzNewGame(52)); // has 5 and not divisible
        assertEquals("Buzz", funGame.fizzAndBuzzNewGame(10)); // don't have 5 and divisible
        assertEquals("19", funGame.fizzAndBuzzNewGame(19)); // don't have 5 and not divisible

        assertEquals("FizzBuzz", funGame.fizzAndBuzzNewGame(35));// has 3 and 5 and divisible
        assertEquals("FizzBuzz", funGame.fizzAndBuzzNewGame(53));// has 3 and 5 and not divisible
        assertEquals("41", funGame.fizzAndBuzzNewGame(41));// don't have 3 and 5 and not divisible
    }
}