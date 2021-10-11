package com.intellij;
import java.util.Map;


//Description:
//
//You're writing code to control your town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to green again.
//
//Complete the function that takes a string as an argument representing the current state of the light and returns a string representing the state the light should change to.
//
//For example, update_light('green') should return 'yellow'.

import java.util.Map;

public class TrafficLight {
    public static String updateLight__og(String current) {

        return current == "red" ? "green" : current == "green" ? "yellow" : "red";
    }

//refactor using .equals
        public static String updateLight_equals(String current) {

            return (current.equals("red") ? "green" : current.equals("yellow") ? "red" : "yellow");
        }

//using map
    private static final Map<String, String> LIGHTS = Map.of(
            "red", "green",
            "green", "yellow",
            "yellow", "red"
    );

    public static String updateLight(String current) {
        return LIGHTS.get(current);
    }

    }

