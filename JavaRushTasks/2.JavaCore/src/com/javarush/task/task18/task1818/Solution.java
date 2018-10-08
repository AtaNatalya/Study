package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream fos = new FileOutputStream(reader.readLine());

        FileInputStream fis = new FileInputStream(reader.readLine());
        FileInputStream fis2 = new FileInputStream(reader.readLine());

        byte[] buff = new byte[fis.available()];
        fis.read(buff);

        byte[] buffer2 = new byte[fis2.available()];
        fis2.read(buffer2);

        fos.write(buff);
        fos.write(buffer2);

        fos.close();
        fis.close();
        fis2.close();







    }
}
