package com.jimson.tdd;

class NumberGame1 {
    private final int number;

    NumberGame1(int number) {
        this.number = number;
    }

    String say() {
        String res = "";
        if (includeKey(3)) {
            res +="fizz";
        }
        if (includeKey(5)) {
            res += "buzz";
        }

        return res.isEmpty() ? number + res : res;
    }

    private boolean includeKey(int i) {
        return dividable(i) || isContains(String.valueOf(i));
    }

    private boolean dividable(int key) {
        return number % key == 0;
    }

    private boolean isContains(String key) {
        return String.valueOf(number).contains(key);
    }
}
