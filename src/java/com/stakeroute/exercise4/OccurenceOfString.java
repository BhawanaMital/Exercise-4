package com.stakeroute.exercise4;

public class OccurenceOfString {

public static boolean checkTheName(String name,String inputname){
    boolean check=false;
    if (name.matches(".*"+inputname+"*.")){
        check=true;
    }
    return check;

}
}
