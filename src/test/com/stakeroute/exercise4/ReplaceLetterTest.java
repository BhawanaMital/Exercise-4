package com.stakeroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceLetterTest {
    ReplaceLetter replaceLetter;

    @Before
    public void setUp() throws Exception {
        replaceLetter=new ReplaceLetter();
    }

    @After
    public void tearDown() throws Exception {
        replaceLetter=null;
    }

    @Test
    public void returnTheChangedString(){
        String actual=replaceLetter.replaceLetterFromString("daily dry");
        assertEquals("faity fry",actual);
    }
}