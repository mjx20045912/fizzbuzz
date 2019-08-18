package com.jimson.tdd;

import org.junit.Test;

import static com.jimson.tdd.NumberGame2.say;
import static junit.framework.Assert.assertEquals;

public class NumberGame2Test {

    @Test
    public void should_return_1_when_1() {
        assertEquals(say(1), "1");
    }

    @Test
    public void should_return_fizz_when_3() {
        assertEquals(say(3), "fizz");
    }

    @Test
    public void should_return_buzz_when_5() {
        assertEquals(say(5), "buzz");
    }

    @Test
    public void should_return_fizzbuzz_when_15() {
        assertEquals(say(15), "fizzbuzz");
    }

    @Test
    public void should_return_fizz_when_13() {
        assertEquals(say(13), "fizz");
    }

    @Test
    public void should_return_buzz_when_51() {
        assertEquals(say(52),"buzz");
    }

    @Test
    public void should_return_fizzbuzz_when_53() {
        assertEquals(say(53), "fizzbuzz");
    }

    @Test
    public void should_call_printf_100_times() {
        
    }
}
