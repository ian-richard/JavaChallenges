package com.intellij;

//Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
//
//Return your answer as a number.


import java.util.List;

public class MixedSum {
    public int sumMixedArray(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
}
