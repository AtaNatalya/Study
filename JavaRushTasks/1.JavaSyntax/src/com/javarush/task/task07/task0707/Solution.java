package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList();
//        for(int i = 0; i < 5; i++){
//            list.add("string"+i);
//        }
        list.add("string0");
        list.add("string1");
        list.add("string1");
        list.add("string3");
        list.add("string4");

        System.out.println(list.size());
        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
