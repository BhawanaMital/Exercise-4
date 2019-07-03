package com.stakeroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordFromParagraphTest {
    SortWordFromParagraph sortWordFromParagraph;

    @Before
    public void setUp() throws Exception {
        sortWordFromParagraph=new SortWordFromParagraph();
    }

    @After
    public void tearDown() throws Exception {
        sortWordFromParagraph=null;
    }

    @Test
    public void returnSortedText() {
        String actual = sortWordFromParagraph.sortWords("A paragraph is a self-contained unit of a discourse in writing dealing with a particular point or idea. A paragraph consists of one or more sentences. Though not required by the syntax of any language, paragraphs are usually an expected part of formal writing, used to organize longer prose");
        String expected="A, A, Though, a, a, a, an, any, are, by, consists, dealing, discourse, expected, formal, idea., in, is, language, longer, more, not, of, of, of, of, one, or, or, organize, paragraph, paragraph, paragraphs, part, particular, point, prose, required, self-contained, sentences., syntax, the, to, unit, used, usually, with, writing, writing";
        assertEquals(expected,actual);
    }

    @Test
    public void returnNull(){
        String actual=sortWordFromParagraph.sortWords(null);
        assertNull(actual);
    }

    @Test
    public void returnNotNull(){
        String actual=sortWordFromParagraph.sortWords("A paragraph is a self-contained unit of a discourse in writing ");
        assertNotNull(actual);
    }
}