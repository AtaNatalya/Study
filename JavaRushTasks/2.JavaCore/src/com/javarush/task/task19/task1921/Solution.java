package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException{

        FileReader re = new FileReader(args[0]);
        BufferedReader r = new BufferedReader(re);
        List<String> l = new ArrayList<>();

        while (r.ready()){
            l.add(r.readLine());
        }

        for(String s : l){
            String [] d = s.split(" ");
            int count = d.length;
            Date b = new Date(Integer.parseInt(d[count-1])-1900, Integer.parseInt(d[count-2])-1, Integer.parseInt(d[count-3]));
            StringBuilder g = new StringBuilder();
            for(int i = 0; i <=count-4; i++){
                g.append(d[i]).append(" ");
            }
            PEOPLE.add(new Person(g.toString().trim(), b));
        }

        re.close();
        r.close();

    }
}
