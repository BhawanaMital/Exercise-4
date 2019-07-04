package com.stakeroute.exercise4;

public class CharacterCount {
    public static int characterCountInString(String string) {

        //Counts the number of character in the string
        int charcount = string.length() - string.replaceAll("a", "").length();
        System.out.println(charcount);
        return charcount;
    }
}


