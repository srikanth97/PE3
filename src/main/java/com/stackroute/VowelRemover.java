package com.stackroute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelRemover {
    public String[] removeVowels(String[] places){
        if(places.length == 0)
            return null;
        List<String> result = new ArrayList<String>();
        for(String str:places){
            result.add(str.replaceAll("(a|e|i|o|u)",""));
        }
        return result.toArray(new String[result.size()]);
    }
}
