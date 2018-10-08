package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        List<String > a = Arrays.asList("user", "loser", "coder", "proger");


        while(a.contains(key = reader.readLine()))
        {
            if(key.equals("user")){
                person = new Person.User();
            } else if (key.equals("loser")){
                person = new Person.Loser();
            } else if (key.equals("coder")){
                person = new Person.Coder();
            } else if (key.equals("proger")){
                person = new Person.Proger();
            }

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder){
            ((Person.Coder) person).coding();
        } else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
