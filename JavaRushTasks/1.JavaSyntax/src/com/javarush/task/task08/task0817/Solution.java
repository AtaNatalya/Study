package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Iterator iter1 = map.entrySet().iterator();
            while (iter1.hasNext()) {
                Map.Entry entry1 = (Map.Entry) iter1.next();
                if (entry.getValue().equals(entry1.getValue()) &&! entry.getKey().equals(entry1.getKey())) {
                    removeItemFromMapByValue(map, (String)entry.getValue());
                    iter = map.entrySet().iterator();
                    break;
                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
