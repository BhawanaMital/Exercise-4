package com.stakeroute.exercise4;

public class ReplaceLetter {
    public static String replaceLetterFromString(String string) {

        //The letter "d" is replaced with "f"
        String string1 = string.replace("d", "f");



        //The letter "l" is replaced with "t"
        String string2 = string1.replace("l", "t");
        System.out.println(string2);
        return string2;



    }
}

