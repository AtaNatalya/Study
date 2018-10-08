package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException{
        if(string == null || string.isEmpty()) throw new TooShortStringException();
        String[] s = string.split("\\t");
        if(s.length < 3) throw new TooShortStringException();
        int firstTabulation = string.indexOf("\t");
        int secondTabulation = string.indexOf("\t", firstTabulation+1);
        return string.substring(firstTabulation+1, secondTabulation);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t"));
    }
}
