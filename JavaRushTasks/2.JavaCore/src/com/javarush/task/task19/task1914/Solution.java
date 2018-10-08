package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream ps = System.out;
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(b);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(ps);
        String out = b.toString();
        String [] res = out.split(" ");
        int  i = Integer.parseInt(res[0]);
        int  u = Integer.parseInt(res[2]);
        int a = 0;

        switch (res[1]){
            case "+":
                a = i +u;
                break;
            case "-":
                a = i - u;
                break;
            case "*":
                a = i * u;
                break;
        }



        System.out.println(res[0] + " " + res[1] + " " + res[2] +" = " + a);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

