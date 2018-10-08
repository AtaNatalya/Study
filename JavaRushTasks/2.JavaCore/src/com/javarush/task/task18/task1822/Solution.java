package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileReader read = new FileReader(file);
        BufferedReader reader2 = new BufferedReader(read) ;

        String res;
        while((res = reader2.readLine()) != null){
            if (res.startsWith(args[0] + " ")){
                System.out.println(res);
                break;
            }
        }

        read.close();
        reader2.close();


    }
}
