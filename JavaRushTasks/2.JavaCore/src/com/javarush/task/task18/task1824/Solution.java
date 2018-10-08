package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream f;

        String fileName;

        while (!(fileName = reader.readLine()).equals("exit")){
            try{
                f = new FileInputStream(fileName);
                f.close();
            } catch (FileNotFoundException g){
                System.out.println(fileName);
                break;
            }
        }


    }
}
