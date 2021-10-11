package com.intellij;

import static com.intellij.TrafficLight.updateLight;

public class Main {

    public static void main(String[] args) {
        var lightChange= updateLight("red");
        System.out.println(lightChange == "green");
    }
}
