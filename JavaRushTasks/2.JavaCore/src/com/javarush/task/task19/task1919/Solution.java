package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException , IOException{
        String fileName = args[0];
        TreeMap<String, Double> t = new TreeMap<>();

        FileReader f = new FileReader(fileName);
        BufferedReader r = new BufferedReader(f);

        while (r.ready()){
            String [] s = r.readLine().split(" ");
            if(t.containsKey(s[0])){
                t.put((s[0]), Double.parseDouble(s[1])+t.get(s[0]));
            } else {
                t.put((s[0]), Double.parseDouble(s[1]));
            }
        }

        for(Map.Entry<String, Double> e : t.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        f.close();
        r.close();
    }
}
