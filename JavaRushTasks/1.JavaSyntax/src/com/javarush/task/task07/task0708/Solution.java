package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++){
            s.add(reader.readLine());
        }

        int y = 0;
        for(int i = 0; i < s.size(); i++){
            if(s.get(i).length() > y){
                y = s.get(i).length();
            }
        }
        for(int i = 0; i < s.size(); i++){
            if(s.get(i).length()== y){
                System.out.println(s.get(i));
            }
        }


    }
}
