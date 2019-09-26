package com.stackroute;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            throw new ExceptionClass("Custom Exception throwing");
        }catch(ExceptionClass e){
            System.out.print(e.getMessage());
        }
    }
}
