package com.stackroute;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class ReadFilesInFolder {
    public static void main(String[] args) throws IOException {
        File folder = new File("src/main/java/com/stackroute");
        FilenameFilter fileNameFilter = new FilenameFilter(){
            @Override
            public boolean accept(File dir,String name){
                if (name.endsWith(".txt")){
                    return  true;
                }else
                    return false;
            }
        };
        File[] files = folder.listFiles(fileNameFilter);
        for(File file:files){
            System.out.println(file);
            FileInputStream fin = new FileInputStream(file);
            byte[] fileContent = new byte[(int)file.length()];
            fin.read(fileContent);
            String s  = new String(fileContent);
            System.out.println(s);
        }
    }
}
