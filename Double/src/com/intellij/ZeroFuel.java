package com.intellij;

public class ZeroFuel {
    public static boolean calculateFuel(double distanceToPump, double mpg, double fuelLeft) {
        return (mpg * fuelLeft) >= distanceToPump? true : false;
}
    }
