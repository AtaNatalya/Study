package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

//        BufferedReader r = new BufferedReader(new FileReader(args[0]));
//        FileWriter f = new FileWriter(args[1]);
//
//        while (r.ready()){
//            String[] g = r.readLine().split(",");
//            String o = "";
//            for(String s : g){
//                if(s.length()>6){
//                    o = o + s + ",";
//                }
//            }
//            f.write(o.substring(0, o.lastIndexOf(",")));
//        }
//
//        r.close();
//        f.close();

        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        BufferedWriter out = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder sb = new StringBuilder();
        while (in.ready()) {
            String line = in.readLine();
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.length() > 6)
                    sb.append(word + ",");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        out.write(sb.toString());
        in.close();
        out.close();
    }
}
