package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException{

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader f = new BufferedReader(new FileReader(r.readLine()));
        String s = "";

        while (f.ready()){
            s = f.readLine();
            String[] g = s.split(" ");
            int i = 0;
            for(int x = 0; x < g.length; x++){
                if (words.contains(g[x]))
                    i++;

            }
            if( i == 2){
                System.out.println(s);
            }

        }
        r.close();
        f.close();

    }
}
