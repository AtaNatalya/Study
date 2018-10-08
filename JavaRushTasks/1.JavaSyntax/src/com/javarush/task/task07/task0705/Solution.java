package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] x = new int[20];
        int[] y = new int[10];
        int[] z = new int[10];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<x.length; i++){
            x[i] = scan.nextInt();
        }

        for(int i =0; i<10; i++){
            y[i] = x[i];
        }

        for(int i=0; i<10; i++){
            z[i] = x[i+10];
            System.out.println(z[i]);
        }


    }
}
