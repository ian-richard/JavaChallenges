package com.intellij;

public class Main {

    public static void main(String[] args) {
	var test1 = CheckFirstLetter.areYouPlayingBanjo("Adam");
        System.out.println(test1); //== no

    var test2 = CheckFirstLetter.areYouPlayingBanjo__OneLine("Ringo");
        System.out.println(test2); //== Yes
    }
}
