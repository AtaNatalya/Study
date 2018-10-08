package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream fic = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file1);

        FileInputStream fis2 = new FileInputStream(file2);

        byte[] buffer1 = new byte[fic.available()];
        fic.read(buffer1);

        byte[] buffer2 = new byte[fis2.available()];
        fis2.read(buffer2);

        fos.write(buffer2);
        fos.write(buffer1);

        fic.close();
        fos.close();
        fis2.close();



    }
}
