package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream f = new FileInputStream(reader.readLine());

        int max = 0;
        while(f.available()>0){
            int d = f.read();
            if(d > max){
                max = d;
            }
        }

        System.out.println(max);

        f.close();
    }
}
