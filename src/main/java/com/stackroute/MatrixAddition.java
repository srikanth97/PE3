package com.stackroute;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixAddition {
    public String addMatrix(int rows,int columns,String array1,String array2) {
        try{

//            int rows,columns;
//            BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
//            System.out.print("Input number of rows of matrix:");
//            rows = Integer.parseInt(br.readLine());
//            System.out.print("Input number of columns of matrix");
//            columns = Integer.parseInt(br.readLine());
//            System.out.printf("Enter %d elements of first array:-",rows*columns);
//            String[] s1 = br.readLine().split("\\s");
//            System.out.printf("Enter %d elements of second array:-",rows*columns);
//            String[] s2 = br.readLine().split("\\s");
            StringBuilder sb = new StringBuilder();
            if(rows <1 || columns <1){
                throw new Exception("Rows or Columns should be greater than 1");
            }
            String[] s1 = array1.split("[,\\s]+");
            String[] s2 = array2.split("[,\\s]+");
            if(s1.length == s2.length && s1.length==rows*columns){
                int temp =0;
                for(int i=0;i<rows;i++){
                    for(int j=0;j<columns;j++){
                      sb.append(Integer.parseInt(s1[temp])+Integer.parseInt(s2[temp]) + "\t");
                      temp++;
                    }
                    sb.append("\n");
                }
                return sb.toString();
            }else
                throw  new Exception("Please enter required no.of Integers");
        }catch (NumberFormatException e){
            return  e.getMessage();
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
