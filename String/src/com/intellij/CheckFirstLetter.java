package com.intellij;

public class CheckFirstLetter {
    public static String areYouPlayingBanjo(String name)
    {
        if( name.toUpperCase().startsWith("R") )
            return name + " plays banjo";
        else
            return name + " does not play banjo";
    }

    public static String areYouPlayingBanjo__OneLine(String name) {
        return (name.charAt(0) == 'r' || name.charAt(0) == 'R') ? name + " plays banjo" : name + " does not play banjo";
    }


}
