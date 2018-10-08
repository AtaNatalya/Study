package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream p = System.out;
        ByteArrayOutputStream d = new ByteArrayOutputStream();
        PrintStream f = new PrintStream(d);
        System.setOut(f);
        testString.printSomething();
        String[] res = d.toString().split("\\n");
        System.setOut(p);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
            if((i+1)%2==0){
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
