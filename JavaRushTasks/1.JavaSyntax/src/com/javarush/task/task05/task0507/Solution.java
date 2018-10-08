package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double z = 0;
        int count = 0;
        double abs = 0;


        while (true) {

            double x = scan.nextDouble();
            if (x == -1) {
                System.out.println(abs);
                break;
            }
            z= x+z;
            count++;
            abs = z/count;



        }


    }
}

