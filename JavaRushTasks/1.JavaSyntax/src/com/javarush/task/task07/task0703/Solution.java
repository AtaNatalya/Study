package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] s = new String [10];

        int[] x = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < s.length; i++){
            s[i] = reader.readLine();
        }

        for(int i = 0; i<x.length; i++){
            x[i] = s[i].length();
            System.out.println(x[i]);
        }
    }
}
