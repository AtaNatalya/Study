package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader f = new BufferedReader(new FileReader(r.readLine()));

        while (f.ready()){
            String s = f.readLine();
            System.out.println(new StringBuilder(s).reverse().toString());
        }

        r.close();
        f.close();
    }
}
