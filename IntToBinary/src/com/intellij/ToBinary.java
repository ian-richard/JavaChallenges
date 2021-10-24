package com.intellij;

public class ToBinary {
    public static int toBinary(int n) {
        return Integer.valueOf(Integer.toBinaryString(n));
    }

    public static int toBinary__Ternery(int n) {
        return n>1 ? toBinary(n/2) * 10 + n%2 : n;
    }

    //manual solution

    public static int toBinary__manual(int n) {
        int multiplier = 1;
        int value = 0;

        do {
            value += (n % 2) * multiplier;
            n /= 2;
            multiplier *= 10;
        } while (n > 0);

        return value;
    }
}
