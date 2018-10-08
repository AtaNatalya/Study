package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));

            int i = Integer.parseInt(reader.readLine());
            int o = Integer.parseInt(reader.readLine());

            if(i<=0 || o<=0){
                throw new Exception();
            } else {
                System.out.println(gcd_1(i, o));
            }



    }

    public static int gcd_1(int a, int b) {
        if (b == 0)
            return a;
        return gcd_1(b, a % b);
    }
}
