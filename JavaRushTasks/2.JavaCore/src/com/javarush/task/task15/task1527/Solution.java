package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        String[] tmp = null;

        try{
            s  = reader.readLine();
            tmp = s.split("\\?");
        } catch (IOException e){
            System.out.println(e.getStackTrace());
        }
        String[] p = tmp[1].split("&");


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
