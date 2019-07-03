package com.stakeroute.exercise4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCountTest {
    CharacterCount characterCount;
    @org.junit.Before
    public void setUp() throws Exception {
        characterCount=new CharacterCount();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        characterCount=null;
    }


    @Test
    public void returnTheNumberOfCharCount(){
        int actual=characterCount.characterCountInString("Java is java again java again");
        assertEquals(10,actual);
    }
}