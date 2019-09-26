package com.stackroute;

import java.util.Scanner;

public class StudentMarks {
    public String Grades(int num,int[] grades) {
        try{
            if (num == grades.length) {
                for(int a:grades){
                    if(a < 0 || a > 100)
                        throw new Exception("Grades entered are incorrect.");
                }
                return "Success";
            }
            else {
                throw  new Exception("Enter all the grades.");
            }
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
