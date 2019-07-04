package com.stakeroute.exercise4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresenceOfName {

       public String matchString(String sentence,String findword){

           //Find the position of the substring in the String
        StringBuffer stringBuffer=new StringBuffer();

        //Pattern class is used to check the case sensitivity of the input string
        Pattern pattern=Pattern.compile(findword,Pattern.CASE_INSENSITIVE);

        //Matcher  class is used to match the substring position
        Matcher matcher=pattern.matcher(sentence);
        while (matcher.find()){
            stringBuffer.append("Found at:").append(matcher.start()).append("-").append(matcher.end()).append("\n");
        }
        return stringBuffer.toString().trim();
    }
}
