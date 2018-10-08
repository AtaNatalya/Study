package com.javarush.task.task13.task1318;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        InputStream in = new FileInputStream(fileName);

        while (in.available() > 0)
        {
            System.out.print((char) in.read());
        }

        in.close();
        reader.close();

  //      D:\Study\Java\JavaRushTasks\JavaRushTasks\2.JavaCore\src\Quest.info
    }
}