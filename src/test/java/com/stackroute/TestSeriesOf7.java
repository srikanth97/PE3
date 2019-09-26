package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class TestSeriesOf7 {
    private static SeriesOf7 s7;
    @BeforeClass
    public static void setup(){
        s7 = new SeriesOf7();
    }

    @AfterClass
    public static void teardown(){
        s7 = null;
    }

    @Test
    public void tesrSeriesof7(){
        assertTrue("seriesof7() have a logical errors.please check your code",s7.seriesof7("3 2 4 1 7 6 5"));
        assertFalse("seriesof7 have a logical error",s7.seriesof7("1 5 3 4 2 7 1"));
        assertFalse("",s7.seriesof7("1 2 1 1 1 1"));

    }

}
