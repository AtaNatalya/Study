package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int maxIndex = 0;
        int maxLength = list.get(0).length();
        int minIndex = 0;
        int minLength = list.get(0).length();

        for (int i = 1; i < list.size(); i++){
            if(list.get(i).length()> maxLength){
                maxIndex = i;
                maxLength = list.get(i).length();
            }
            if(list.get(i).length() < minLength){
                minIndex = i;
                minLength = list.get(i).length();
            }
        }

        for (int i = 1; i < list.size(); i++){

        }

        if( minIndex > maxIndex){
            System.out.println(list.get(maxIndex));
        } else {
            System.out.println(list.get(minIndex));
        }

    }
}
