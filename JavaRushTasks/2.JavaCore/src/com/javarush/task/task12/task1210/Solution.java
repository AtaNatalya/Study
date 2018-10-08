package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int max (int a, int b){
        int c = 0;
        if (a > b){
            c = a;
        } else {
            c = b;
        }
        return c;
    }

    public static long max (long a, long b){
        long c = 0;
        if (a > b){
            c = a;
        } else {
            c = b;
        }
        return c;
    }

    public static double max (double a, double b){
        double c = 0;
        if (a > b){
            c = a;
        } else {
            c = b;
        }
        return c;
    }
}
