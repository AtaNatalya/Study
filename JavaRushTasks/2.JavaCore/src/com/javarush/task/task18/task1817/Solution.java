package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        int count = 0;
        int spaces = 0;

        while (fileInputStream.available()>0){
            count++;
            if(fileInputStream.read() == 32){
                spaces++;
            }
        }

        double d = (double)spaces/count*100;
        System.out.printf("%.2f", d);
        fileInputStream.close();

    }
}
