package com.stakeroute.exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PresenceOfNameTest {
    PresenceOfName presenceOfName;

    @Before
    public void setUp() throws Exception {
        presenceOfName = new PresenceOfName();
    }

    @After
    public void tearDown() throws Exception {
        presenceOfName = null;
    }

    @Test
    public void returnTheIndex() {
        String actual = presenceOfName.matchString("She sells seashells by the seashore", "se");
        assertEquals("Found at:4-6\n" +
                "Found at:10-12\n" +
                "Found at:27-29", actual);
    }

    @Test
    public void returnNotNull() {
        String actual = presenceOfName.matchString("She sells seashells by the seashore", "se");
        assertNotNull(actual);
    }

}