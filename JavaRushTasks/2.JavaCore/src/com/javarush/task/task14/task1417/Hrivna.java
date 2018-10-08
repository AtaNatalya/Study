package com.javarush.task.task14.task1417;

import java.util.Map;

/**
 * Created by user on 11/16/2017.
 */
public class Hrivna extends Money {
    public  String getCurrencyName(){
        return "HRN";
    }

    public Hrivna(double amount) {
        super(amount);
    }
}
