package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> create = new ArrayList<>();
        int [] first = {1, 2, 3, 4, 5};
        int [] second =  {6, 7};
        int [] third =  {9, 7, 6, 4};
        int [] fourth =  {4, 5, 3, 1, 0, 5, 9};
        int [] fifth =  {};
        create.add(0, first);
        create.add(1, second);
        create.add(2, third);
        create.add(3, fourth);
        create.add(4, fifth);
        return create;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
