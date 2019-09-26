package com.stackroute;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequencyOfWords {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/stackroute/FileDemo.txt");
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(file));
            StringBuilder  sb = new StringBuilder();
            String s1;
            while ((s1= br.readLine()) != null){
                sb.append(s1+" ");
            }
            String[] allwords = sb.toString().split("[,\\s]+");
            List<String>  unique = new ArrayList<String >();
            unique.add(allwords[0]);
            for(String temp:allwords){
                if(!unique.contains(temp)){
                    unique.add(temp);
                }
            }
           for(String temp:unique){
               int count = 0;
               for(String temp2:allwords){
                   if(temp.equals(temp2))
                       count++;
               }
               System.out.println(temp +"->"+count + " times");
           }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
