package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] x = new int[10];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<x.length; i++){
            x[i] = scan.nextInt();
        }

        for(int i = 9; i>=0; i--){
            System.out.println(x[i]);
        }
    }
}

