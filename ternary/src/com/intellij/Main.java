package com.intellij;

import static com.intellij.TrafficLight.updateLight;
import static com.intellij.OddOrEven.simpleMultiplication;

public class Main {

    public static void main(String[] args) {
//        var lightChange= updateLight("red");
//        System.out.println(lightChange == "green");

        var oddOrEven = simpleMultiplication(3);
        System.out.println(oddOrEven == 27);

        var oddOrEven1 = new OddOrEven();
        int sum = OddOrEven.simpleMultiplication(4);
        System.out.println(sum == 32);

    }
}
