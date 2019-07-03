package com.stakeroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseEachWordTest {
    ReverseEachWord reverseEachWord;
    @Before
    public void setUp() throws Exception {
        reverseEachWord=new ReverseEachWord();
    }

    @After
    public void tearDown() throws Exception {
        reverseEachWord=null;
    }

    @Test
    public void returnReverseString(){
        String actual=reverseEachWord.reverseWord("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",actual);
    }

    @Test
    public void returnNull(){
        String actual=reverseEachWord.reverseWord(null);
        assertNull(actual);
    }

    @Test
    public void returnNotNull(){
        String actual=reverseEachWord.reverseWord("a quick brown fox jumps over the lazy dog");
        assertNotNull(actual);
    }
}