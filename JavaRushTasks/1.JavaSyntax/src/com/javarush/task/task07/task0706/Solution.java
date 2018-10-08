package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] x = new int[15];

        int y = 0;
        int o = 0;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<x.length; i++){
            x[i] = scan.nextInt();
            if(i%2==0){
                y += x[i];
            } else {
                o += x[i];
            }
        }
        if(y>o){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }


        }
}
