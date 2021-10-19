package com.intellij;

public class Main {

    public static void main(String[] args) {
	  var res1 = Maskify.maskify("123456781111");
        System.out.println(res1.equals("########1111"));
    }
}
