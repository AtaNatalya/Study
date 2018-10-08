package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int a, int b){
        int c = 0;
        if ( a>b){
            c = b;
        } else {
            c = a;
        }
        return c;
    }

    public static long min(long a, long b){
        long c = 0;
        if ( a>b){
            c = b;
        } else {
            c = a;
        }
        return c;
    }

    public static double min(double a, double b){
        double c = 0;
        if ( a>b){
            c = b;
        } else {
            c = a;
        }
        return c;
    }

}
