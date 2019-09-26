package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class TestStudentMarks {
    private static StudentMarks sm;
    @BeforeClass
    public static void setup(){
        sm = new StudentMarks();
    }

    @AfterClass
    public static void teardown(){
        sm = null;
    }

    @Test
    public void testGrades(){
        assertEquals("Grades entered are not incorrect","Enter all the grades.",sm.Grades(5, new int[]{1, 2, 3, 4}));
        assertEquals("Grades entered are not incorrect","Grades entered are incorrect.",sm.Grades(5, new int[]{50,60,70,80,101}));
        assertEquals("Grades entered are not incorrect","Success",sm.Grades(5, new int[]{50,60,70,80,90}));
        assertEquals("Grades entered are not incorrect","Grades entered are incorrect.",sm.Grades(5, new int[]{50,60,70,80,-10}));
    }
}
