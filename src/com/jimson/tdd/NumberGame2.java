package com.jimson.tdd;

import java.util.stream.IntStream;

public class NumberGame2 {
    public static String say(int i) {
        String res = "";
        if (dividable(i, 3)) res += "fizz";
        if (dividable(i, 5)) res += "buzz";
        return res.isEmpty() ? i + res : res;
    }

    private static boolean dividable(int i, int factor) {
        return  i % factor == 0 || String.valueOf(i).contains(String.valueOf(factor));
    }

    public static void show(int count) {
        IntStream.range(1, count).forEach(item ->  System.out.println(say(item)));
    }
}
