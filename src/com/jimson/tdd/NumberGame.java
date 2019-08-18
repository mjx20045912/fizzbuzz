package com.jimson.tdd;

public class NumberGame {
    private int number;
    public NumberGame(int number) {
        this.number = number;
    }

    public String say() {
        String res = "";
        if(dividable(3)) res += "fizz";
        if(dividable(5)) res += "buzz";
        if(res.isEmpty()) res = "" + number;
        return res;
    }

    private boolean dividable(int i) {
        return number % i == 0;
    }
}
