package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream f = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> d = new HashMap<>();
        while(f.available()>0){
            int k = f.read();
            if(d.containsKey(k)){
                d.put(k, d.get(k).intValue()+1);
            } else if (!d.containsKey(k)){
                d.put(k, 1);
            }
        }
        int maxCount = 0;
        for(Map.Entry<Integer, Integer> entry : d.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
            }
        }

        String print = "";

        for(Map.Entry<Integer, Integer> pair : d.entrySet() )
        {
            if (pair.getValue() == maxCount)
                print += pair.getKey() + " ";
        }

        System.out.println(print);
        f.close();


    }
}
