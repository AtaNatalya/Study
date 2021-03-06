package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder build = new StringBuilder();
        StringBuilder build2 = new StringBuilder();
        String s = reader.readLine();
        char[] ch = s.toCharArray();

        for(char c : ch){
            if (isVowel(c)){
                build.append(c+" ");
            } else if (!Character.isWhitespace(c)){
                build2.append(c+" ");
            }

        }
        System.out.println(build);
        System.out.println(build2);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}