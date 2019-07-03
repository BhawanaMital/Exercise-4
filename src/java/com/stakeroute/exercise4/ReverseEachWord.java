package com.stakeroute.exercise4;

public class ReverseEachWord {
    public static String reverseWord(String paragraph){
        if(paragraph==null){
         return null;
        }
        StringBuffer reverseText=new StringBuffer();

        for (String string:paragraph.split(" ")){
            StringBuffer store=new StringBuffer(string);
            store.reverse();
            reverseText.append(store).append(" ");
        }
        return reverseText.substring(0,reverseText.length()-1);
    }
}
