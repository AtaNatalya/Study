package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException{

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        FileReader r = new FileReader(reader.readLine());
//
//        int count = 0;
//        String s = "";
//
////        while(r.ready()){
////            s += String.valueOf((char)r.read());
////        }
////
////        s = s.replace("\\p{Punct}", "");
////        s = s.replace("\n", " ");
////
////        String [] b = s.split(" ");
////        for (String d : b){
////            d = d.trim();
////            if(d.equals("world")){
////                count++;
////            }
////        }
//
//        StringBuilder sb = new StringBuilder();
//
//
//        System.out.println(count);
//
//        reader.close();
//        r.close();

        Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader( new FileReader(sc.nextLine()));
        sc.close();
        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = in.readLine()) != null)
            sb.append(s + ",");
        in.close();
        String[] words = sb.toString().split("\\W");
        int counter = 0;
        for (String str: words) {
            if (str.equals("world")) counter++;
        }
        System.out.println(counter);


    }
}
