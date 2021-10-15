package com.intellij;

public class Main {

    public static void main(String[] args) {
	var res = Username.validateUsername("regex");
        System.out.println("Username__true: ");
        System.out.println(res == true);

    var res__false = Username.validateUsername("Ian");
        System.out.println("Username__false: ");
        System.out.println(res == false);

    var checkPin = ValidatePin.validatePin("123456");
        System.out.println("Check pin__true");
        System.out.println(checkPin);

    var checkPin__false = ValidatePin.validatePin("a234");
        System.out.println("Check pin__false");
        System.out.println(checkPin__false);


    }


}
