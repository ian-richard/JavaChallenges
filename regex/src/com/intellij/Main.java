package com.intellij;

public class Main {

    public static void main(String[] args) {
	var res = Username.validateUsername("regex");
        System.out.println(res == true);
    }
}
