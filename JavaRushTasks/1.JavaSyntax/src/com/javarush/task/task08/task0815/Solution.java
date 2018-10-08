package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("first", "last");
        map.put("first3", "last");
        map.put("second", "third");
        map.put("sd", "sedf");
        map.put("fiasdfrst", "sdf");
        map.put("adg", "xcbxcvb");
        map.put("fsdfgt", "sdfgsdfg");
        map.put("fifgt", "lxcvxcvt");
        map.put("first2", "lcvzxvgt");
        map.put("dfgdfgst", "ldfgdggt");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for(HashMap.Entry<String, String> row : map.entrySet()){
            if(row.getValue().equals(name)){
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for(HashMap.Entry<String, String> row : map.entrySet()){
            if(row.getKey().equals(lastName)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
