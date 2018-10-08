package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        byte[] data = new byte[fis.available()];
        fis.read(data);

        String[] s = new String(data).split(" ");

        StringBuilder builder = new StringBuilder();

        for(String c : s){
            builder.append(Math.round(Double.valueOf(c)) + " ");
        }

        fos.write(builder.toString().getBytes());

        fis.close();
        fos.close();
    }
}
