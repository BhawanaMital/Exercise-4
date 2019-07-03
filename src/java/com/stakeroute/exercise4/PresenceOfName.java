package com.stakeroute.exercise4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresenceOfName {

   /* public String matching(String inputString,String givenString){
        StringBuffer stringBuffer=new StringBuffer();
        Pattern pattern=Pattern.compile(givenString,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(inputString);
        while (matcher.find()){
            stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
        }
        return stringBuffer.toString().trim();
    }*/

    public String matchString(String sentence,String findword){
        StringBuffer stringBuffer=new StringBuffer();
        Pattern pattern=Pattern.compile(findword,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(sentence);
        while (matcher.find()){
            stringBuffer.append("Found at:").append(matcher.start()).append("-").append(matcher.end()).append("\n");
        }
        return stringBuffer.toString().trim();
    }
}
