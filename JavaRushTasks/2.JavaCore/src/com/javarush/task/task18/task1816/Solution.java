package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int count = 0;
        while (fileInputStream.available() > 0){
            int s = fileInputStream.read();
            if((s >= 65 && s <=90) || (s >= 97 && s <=122) ){
                count++;
            }
        }
        System.out.println(count);
        fileInputStream.close();

    }
}
