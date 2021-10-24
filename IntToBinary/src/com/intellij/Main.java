package com.intellij;

public class Main {

    public static void main(String[] args) {
	    var t1 = ToBinary.toBinary(50);
        System.out.println(t1 == 110010);

        var t2 = ToBinary.toBinary__Ternery(50);
        System.out.println(t1 == 110010);

        var t3 = ToBinary.toBinary__manual(50);
        System.out.println(t1 == 110010);
    }
}
