package com.intellij;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	var t1 = EvenNumbers.divisibleBy(new int[]{2,3,6,8,9,12}, 3);
        System.out.println(Arrays.toString(t1));
    }
}
