package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class TestVowelRemover {
    private static VowelRemover vr;
    @BeforeClass
    public static void setup(){
        vr = new VowelRemover();
    }

    @AfterClass
    public static void teardown(){
        vr= null;
    }

    @Test
    public void TestRemoveVowels() {
        assertEquals("removeVowels() do not remove vowels from all the strings in the places",new String[]{"Ind","Grmny","Untd Stts"},vr.removeVowels(new String[]{"India","Germany","United States"}));
        assertNull("removeVowels() do not remove vowels from all the strings in the places",vr.removeVowels(new String[]{}));
        assertEquals("removeVowels() do not remove vowels from all the strings in the places",new String[]{"nd"},vr.removeVowels(new String[]{"india"}));
    }
}
