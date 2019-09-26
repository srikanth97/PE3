package com.stackroute;

import java.util.Arrays;

public class SeriesOf7 {
    public boolean seriesof7(String str){
        try{
            String[] s1 = str.split("[,\\s]+");
            int[] array = new int[s1.length];
            for(int i=0;i<s1.length;i++)
                array[i] = Integer.parseInt(s1[i]);
            Arrays.sort(array);
            for(int i=0;i<array.length-1;i++){
                if((array[i+1]- array[i]) != 1)
                    return false;
            }
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
