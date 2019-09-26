
package com.stackroute;

import java.io.*;
import java.net.URL;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/stackroute/example.txt");
        try{
            System.out.println(file.length());
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;
            while((str = br.readLine()) != null){
                System.out.println(str.toUpperCase());
            }
        }catch (FileNotFoundException e){
            System.out.print(e.getMessage());
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
