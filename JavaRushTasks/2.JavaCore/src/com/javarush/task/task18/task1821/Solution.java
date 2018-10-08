package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException{

        FileInputStream fis = new FileInputStream(args[0]);
        TreeMap<Character, Integer> t = new TreeMap();
        byte [] data = new byte[fis.available()];
        fis.read(data);
        char [] d = new String(data).toCharArray();

        for(char g : d){
            if(t.containsKey(g)){
                t.put(g, t.get(g)+1);
            } else {
                t.put(g, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : t.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        fis.close();

    }


}
