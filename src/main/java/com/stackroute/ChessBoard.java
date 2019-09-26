package com.stackroute;

public class ChessBoard {
    public static void main(String[] args){
        String[][] array = new String[8][8];
        for(int i=0; i< 8;i++){
            for(int j=0;j<8;j++) {
                if ((i + j) % 2 == 0){
                    array[i][j] = "WW|";
                    System.out.println("WW|");
                }
                else{
                    array[i][j] = "BB|";
                    System.out.print("BB|");
                }
            }
        }
    }
}
