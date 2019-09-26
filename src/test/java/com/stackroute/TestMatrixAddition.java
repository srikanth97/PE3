package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class TestMatrixAddition {
    private static MatrixAddition ma;
    @BeforeClass
    public static void setup(){
        ma = new MatrixAddition();
    }

    @AfterClass
    public static void teardown(){
        ma = null;
    }

    @Test
    public void testAddition() {
        assertEquals("Addition function does not return exact values","2\t4\t\n6\t8\t\n",ma.addMatrix(2,2,"1 2 3 4","1 2 3 4"));
        assertEquals("Addition function does not handle the Exception","For input string: \"x\"",ma.addMatrix(2,2,"1 x 3 4","1 2 3 4"));
        assertEquals("Addition function does not handle the Exception","Please enter required no.of Integers",ma.addMatrix(2,2,"1 2 4","1 2 3 4"));
        assertEquals("Addition function does not handle the Exception","Please enter required no.of Integers",ma.addMatrix(2,2,"1 2 4 3","1 2 3 4 5"));
        assertEquals("Addition function does not handle the Exception","Rows or Columns should be greater than 1",ma.addMatrix(0,2,"1 2 4 3","1 2 3 4 5"));
    }
}
