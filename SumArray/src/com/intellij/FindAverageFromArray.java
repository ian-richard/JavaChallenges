package com.intellij;
//
//There was a test in your class and you passed it. Congratulations!
//        But you're an ambitious person. You want to know if you're better than the average student in your class.
//
//        You receive an array with your peers' test scores. Now calculate the average and compare your score!
//
//        Return True if you're better, else False!
//        Note:
//
//        Your points are not included in the array of your class's points. For calculating the average point
//        you may add your point to the given array!


import java.util.Arrays;

public class FindAverageFromArray {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        int avg = 0;
        int len = classPoints.length;

        for (int value : classPoints) {
            sum += value;
        }
        sum += yourPoints;
        avg = sum / len;

        return yourPoints >= avg ? true : false;

    }


    static boolean betterThanAverage__oneLine(final int[] classPoints, final int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }

}
