package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

       Iterator it = cats.iterator();
       cats.remove(it.next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        for(int i = 0; i < 3; i++){
            Cat cat = new Cat();
            cats.add(cat);
        }
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for(Cat c : cats){
            System.out.println(c);
        }

    }

    public static class Cat{

    }
}
