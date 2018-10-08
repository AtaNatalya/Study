package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Hello", "World");
        map.put("Hello", "World1");
        map.put("Hello2", "World");
        map.put("Hello", "World3");
        map.put("Hello4", "World");
        map.put("Hello", "World5");
        map.put("Hello6", "World");
        map.put("Hello", "World7");
        map.put("Hello8", "World");
        map.put("Hello", "World9");





        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
