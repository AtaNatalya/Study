package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("first", 345);
        map.put("first3", 4678);
        map.put("second", 4567);
        map.put("sd", 345);
        map.put("fiasdfrst", 455);
        map.put("adg", 245);
        map.put("fsdfgt", 25);
        map.put("fifgt", 2456);
        map.put("first2", 245);
        map.put("dfgdfgst", 2456);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            HashMap.Entry<String, Integer> entry = (HashMap.Entry) it.next();
            if( entry.getValue() < 500){
                it.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}