package com.intellij;

import static com.intellij.SumArray.sum;

public class Main {

    public static void main(String[] args) {
        var res = sum(new double[] {0});
        System.out.println(res == 0);

        var res1 = sum(new double[] {1, 2, 3});
        System.out.println(res1 == 6.0);

        double res2 = SumArray.sum(new double[] {1, 2, 4});
        System.out.println(res2 == 7.0);



    }
}
