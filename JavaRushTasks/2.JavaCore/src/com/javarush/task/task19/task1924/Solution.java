package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException{

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader f = new BufferedReader(new FileReader(r.readLine()));

        while (f.ready()){
            String [] s = f.readLine().split(" ");
            String line = "";
            for (String d : s){
                if((d.matches("((1[012])|[0-9])"))){
                    line = line + map.get(Integer.parseInt(d)) + " ";
                } else {
                    line = line + d + " ";
                }
            }
            line.trim();
            System.out.println(line);
        }

        r.close();
        f.close();

    }
}
