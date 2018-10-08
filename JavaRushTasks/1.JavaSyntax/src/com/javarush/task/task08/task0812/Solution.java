package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> mas = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int count = 1;
        int max = 1;
        for (int i = 0; i < 10; i++){
            mas.add(scan.nextInt());
            if(i > 0){
                if(mas.get(i).equals(mas.get(i-1))){
                    count++;
                    if(count > max){
                        max = count;
                    }
                } else {
                    count = 1;
                }
            }
        }
        System.out.println(max);
    }
}