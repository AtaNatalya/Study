package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException{
        String fileName = args[0];
        TreeMap<String, Double> t = new TreeMap<>();
        double d = Double.MIN_VALUE;

        BufferedReader r = new BufferedReader(new FileReader(fileName));

        while (r.ready()){
            String [] s = r.readLine().split(" ");
            if(t.containsKey(s[0])){
                t.put((s[0]), Double.parseDouble(s[1])+t.get(s[0]));
            } else {
                t.put((s[0]), Double.parseDouble(s[1]));
            }
        }

        for(Map.Entry<String, Double> e : t.entrySet()){
            d = Math.max(d,e.getValue());
        }

        for(Map.Entry<String, Double> e : t.entrySet()){
            if(e.getValue().equals(d)){
                System.out.println(e.getKey());
            }
        }

        r.close();
    }
}
