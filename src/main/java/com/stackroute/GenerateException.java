package com.stackroute;

import javax.print.DocFlavor;

public class GenerateException {
    public String exceptionHandler(int size,String str,boolean bool){
        try{
            Integer[] array = new Integer[size];
            String[] s1 = str.split(" ");
            for(int i=0;i<s1.length;i++){
                array[i] = Integer.parseInt(s1[i]);
            }
            if(bool){
                s1 = null;
                s1.toString();
            }
        }catch (NegativeArraySizeException e){
            return "ArraySize Cannot be negative";
        }catch (ArrayIndexOutOfBoundsException e){
            return "Array Index out of bounds error";
        }catch (NullPointerException e){
            return "Null pointer exception";
        }
        return null;
    }
}
