package com.intellij;

public class Main {

    public static void main(String[] args) {
	    var t1 = FindGreatestSum.expressionsMatter(6,7,1);
        System.out.println(t1 == 48);

        var t2 = FindGreatestSum.mathMaxSol(6,7,1);
        System.out.println(t2 == 48);
    }
}
