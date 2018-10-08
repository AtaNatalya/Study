package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        String number = null;
        int x = 0;
        int sum = 0;

        while(true){
             number = reader.readLine();
             if(number.equals("сумма")){
                 System.out.println(sum);
                 break;
             }
             x = Integer.parseInt(number);
             sum = sum + x;
        }
    }
}
