package com.intellij;

public class Main {

    public static void main(String[] args) {
	var test_true = ZeroFuel.calculateFuel(50, 25, 2);
        System.out.println(test_true);
    var test_false = ZeroFuel.calculateFuel(100, 50, 1);
        System.out.println(test_false);
    }
}
