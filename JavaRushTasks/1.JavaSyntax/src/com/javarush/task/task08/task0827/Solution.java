package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JAN 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date dat = new Date(date);
        Date d = new Date(dat.getYear(), 0, 0);
        long c = (dat.getTime() - d.getTime())/(24*60*60*1000);
        boolean b = false;
        if (c%2!=0){
            b = true;
        }
        return b;
    }
}
