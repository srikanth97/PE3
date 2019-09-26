package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class TestDateOfaWeek {
    private static DateOfaWeek dw;
    @BeforeClass
    public static void setup(){
        dw = new DateOfaWeek();
    }

    @AfterClass
    public static void teardown(){
        dw = null;
    }

    @Test
    public void testDateCalculator() {
       assertEquals("First and last date are not calculated Correctly","Mon 23/09/2019\tSun 29/09/2019",dw.DateCalculator());
    }
}
