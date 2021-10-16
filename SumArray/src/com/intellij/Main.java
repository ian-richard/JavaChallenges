package com.intellij;

import static com.intellij.SumArray.sum;
import static com.intellij.SumArray.sumStream;

public class Main {

    public static void main(String[] args) {

        //using stream
//        var res = sumStream(new double[] {0});
//        System.out.println(res == 0);
//
//        var res1 = sumStream(new double[] {1, 2, 3});
//        System.out.println(res1 == 6.0);
//
//        double res2 = SumArray.sumStream(new double[] {1, 2, 4});
//        System.out.println(res2 == 7.0);

        var test_true = FindAverageFromArray.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75);
        System.out.println(test_true);

        var test_false = FindAverageFromArray.betterThanAverage__oneLine(new int[] {100, 90}, 11);
        System.out.println(test_false);

    }
}
