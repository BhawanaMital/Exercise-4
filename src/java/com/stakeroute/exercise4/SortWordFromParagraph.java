package com.stakeroute.exercise4;

import java.util.Arrays;

public class SortWordFromParagraph {

    public static String sortWords(String paragraph){


        //Checking whether the paragraph content is null or not.
        if(paragraph==null){
            return null;
        }
        else {
            String[] sortedText=paragraph.split(" ");

            //Sorting the text using Array class
            Arrays.sort(sortedText);

            return Arrays.toString(sortedText);
        }
    }
}
