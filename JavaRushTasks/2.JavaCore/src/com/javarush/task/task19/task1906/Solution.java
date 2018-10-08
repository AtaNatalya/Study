package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileReader r = new FileReader(file1);
        FileWriter w = new FileWriter(file2);

        for( int i = 1; r.ready(); i++){
            int c = r.read();
            if(i % 2 == 0){
                w.write(c);
            }
        }

        reader.close();
        r.close();
        w.close();
    }
}
