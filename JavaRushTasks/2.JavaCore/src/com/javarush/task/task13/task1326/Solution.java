package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (reader.ready())
        {
            int num = Integer.parseInt(reader.readLine());
            if (num % 2 == 0) list.add(num);
        }

        reader.close();

        Collections.sort(list);

        for (int x : list) System.out.println(x);
    }
}
