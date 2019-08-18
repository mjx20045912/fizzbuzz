package com.jimson.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberGame1Test {

    private String getStringValue;


    String getStringValue(int number) {
        return new NumberGame1(number).say();
    }

    @Test
    public void should_return_1_when_input_1() {
        assertEquals(getStringValue(1), "1");
    }

    @Test
    public void should_return_fizz_when_input_3() {
        assertEquals(getStringValue(3), "fizz");
    }

    @Test
    public void should_return_buzz_when_input_5() {
        assertEquals(getStringValue(5), "buzz");
    }

    @Test
    public void should_return_fizzbuzz_when_input_15() {
        assertEquals(getStringValue(15), "fizzbuzz");
    }

    @Test
    public void should_return_fizz_when_number_include_3() {
        assertEquals(getStringValue(13),"fizz" );
    }

    @Test
    public void should_return_buzz_when_number_include_5() {
        assertEquals(getStringValue(25), "buzz" );
    }

    @Test
    public void should_return_fizzbuzz_when_number_include_3_and_5() {
        assertEquals(getStringValue(35),"fizzbuzz" );
    }

}
