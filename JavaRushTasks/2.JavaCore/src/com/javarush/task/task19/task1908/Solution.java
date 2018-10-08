package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        BufferedReader r = new BufferedReader(new FileReader(file1));
        BufferedWriter w = new BufferedWriter(new FileWriter(file2));

        while (r.ready()){
            for(String s : r.readLine().split(" ")){
                if(checkString(s)){
                    w.write(s + " ");
                }

            }
        }

        reader.close();
        r.close();
        w.close();

    }

    public static boolean checkString(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }
}
