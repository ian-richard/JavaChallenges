package com.intellij;

//Given a number n, return the number of positive odd numbers below n, EASY!
//
//        oddCount(7) //=> 3, i.e [1, 3, 5]
//        oddCount(15) //=> 7, i.e [1, 3, 5, 7, 9, 11, 13]
//
//        Expect large Inputs!


public class OddCount {
    public static int oddCount(int n){
        int count = 0;

        for(int i=1; i<n; i++) {

            if (i%2!=0) count++;
        }
        return count;
    }
    // The java.lang.Math.floor() is used to find the largest integer value which is less than
    // or equal to the argument and is equal to the mathematical integer of a double value.
    public static int oddCount__MathFloor(int n){
        return (int) Math.floor( n/2 );
    }

}

