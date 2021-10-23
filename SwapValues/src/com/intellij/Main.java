package com.intellij;

public class Main {

    public static void main(String[] args) {
        Integer[] values = new Integer[]{1,2};
        var t1 = new Swapper(values);
        System.out.println(t1);
    }
}
