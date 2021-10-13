package com.intellij;

//Description:
//
//        Write a simple regex to validate a username. Allowed characters are:
//
//        lowercase letters,
//        numbers,
//        underscore
//
//        Length should be between 4 and 16 characters (both included).


public class Username {
    public static boolean validateUsername(String s){
        return s.matches("[a-z_\\\\d]{4,16}");
    }
}
