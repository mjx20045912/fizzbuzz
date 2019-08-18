package com.jimson.tdd;

import org.junit.Assert;
import org.junit.Test;

public class NumberGameTest {
    private String getNumberGame(int number) {
        return (new NumberGame(number)).say();
    }

    @Test
    public void should_return_1_when_1(){
        Assert.assertEquals(getNumberGame(1),"1");
    }

    @Test
    public void should_return_fizz_when_3(){
        Assert.assertEquals(getNumberGame(3),"fizz");
    }

    @Test
    public void should_return_buzz_when_5(){
        Assert.assertEquals(getNumberGame(5),"buzz");
    }

    @Test
    public void should_return_fizzbuzz_when_15(){
        Assert.assertEquals(getNumberGame(15), "fizzbuzz");
    }
}