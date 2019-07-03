package com.stakeroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceOfStringTest {
    OccurenceOfString occurenceOfString;
    @Before
    public void setUp() throws Exception {
        occurenceOfString=new OccurenceOfString();
    }

    @After
    public void tearDown() throws Exception {
        occurenceOfString=null;
    }

    @Test
    public void returnTrue(){
        boolean actual=occurenceOfString.checkTheName("henry","henry");
        assertEquals(true,actual);
    }

    @Test
    public void returnFalse(){
        boolean actual=occurenceOfString.checkTheName("henry","harry");
        assertEquals(false,actual);
    }
}