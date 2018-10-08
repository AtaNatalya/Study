package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(args[0]));

       FileWriter out = new FileWriter(args[1]);

        while (in.ready()){
            String [] d = in.readLine().split(" ");
            for(int i =0; i < d.length; i++){
                if(d[i].matches(".*[0-9].*")){
                    out.write(d[i] + " ");
                }
            }
        }

        in.close();
        out.close();
    }
}
