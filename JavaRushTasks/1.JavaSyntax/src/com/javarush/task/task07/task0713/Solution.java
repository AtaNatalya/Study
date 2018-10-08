package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> all = new ArrayList<>();
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div2 = new ArrayList<>();
        ArrayList<Integer> rem = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 20; i++){
            all.add(scan.nextInt());
        }

        for (Integer in : all){
            if(in%3==0 && in%2==0){
                div3.add(in);
                div2.add(in);
            } else if (in%3==0){
                div3.add(in);
            } else if (in%2==0){
                div2.add(in);
            } else {
                rem.add(in);
            }
        }
        printList(div3);
        printList(div2);
        printList(rem);
    }

    public static void printList(List<Integer> list) {
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
