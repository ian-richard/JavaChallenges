package com.intellij;
import com.intellij.CockroachCalc;
public class Main {

    public static void main(String[] args) {
	    var result = CockroachCalc.cockroachSpeed(1.08);
        System.out.println(result == 30);

        var result1 = CockroachCalc.cockroachSpeed(1.09);
        System.out.println(result1 == 30);

        var result2 = CockroachCalc.cockroachSpeed(0);
        System.out.println(result2 == 0);
    }
}
