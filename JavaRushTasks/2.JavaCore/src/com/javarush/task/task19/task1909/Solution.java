package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        BufferedReader r = new BufferedReader(new FileReader(file1));
        BufferedWriter w = new BufferedWriter(new FileWriter(file2));

        while (r.ready()){
            w.write(r.readLine().replace(".", "!"));
        }

        reader.close();
        r.close();
        w.close();
    }
}
