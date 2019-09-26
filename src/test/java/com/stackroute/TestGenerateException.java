package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class TestGenerateException {
    private static GenerateException ge;
    @BeforeClass
    public static void setup(){
        ge = new GenerateException();
    }

    @AfterClass
    public static void teardown(){
        ge = null;
    }

    @Test
    public void testExceptionHandler() {
        assertEquals("exceptionHandler() should not accept negative numbers","ArraySize Cannot be negative",ge.exceptionHandler(-1,"1 2 3 4",false));
        assertEquals("exceptionHandler() should take only string of given integers","Array Index out of bounds error",ge.exceptionHandler(2,"1 2 3 4",false));
        assertEquals("exceptionHandler() null pointer Exception","Null pointer exception",ge.exceptionHandler(4,"1 2 3 4",true));
        assertNull("No errors detected",ge.exceptionHandler(2,"12 13",false));
    }
}
