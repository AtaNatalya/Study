package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone0", new Date("APRIL 1 1980"));
        map.put("Stallone1", new Date("MAY 2 1981"));
        map.put("Stallone2", new Date("JUNE 3 1982"));
        map.put("Stallone3", new Date("JULY 4 1983"));
        map.put("Stallone4", new Date("AUGUST 5 1984"));
        map.put("Stallone5", new Date("SEPTEMBER 6 1985"));
        map.put("Stallone6", new Date("OCTOBER 7 1986"));
        map.put("Stallone7", new Date("NOVEMBER 8 1987"));
        map.put("Stallone8", new Date("DECEMBER 9 1988"));
        map.put("Stallone9", new Date("JUNE 10 1989"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            HashMap.Entry pair = (HashMap.Entry) it.next();
            Date d = (Date) pair.getValue();
            if ((d.getMonth() > 4)&&(d.getMonth() < 8))
                it.remove();
        }
    }

    public static void main(String[] args) {

    }
}
