package com.stakeroute.exercise4;

import java.util.Arrays;

public class SortWordFromParagraph {

    public static String sortWords(String paragraph){
        if(paragraph==null){
            return null;
        }
        else {
            String[] sortedText=paragraph.split(" ");
            Arrays.sort(sortedText);

            return Arrays.toString(sortedText);
        }
    }
}
