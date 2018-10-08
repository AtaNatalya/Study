package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String fileName = r.readLine();
        r.close();

        PrintStream p = System.out;
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        PrintStream s = new PrintStream(b);
        System.setOut(s);
        testString.printSomething();
        System.setOut(p);
        System.out.println(b.toString());

        FileOutputStream f = new FileOutputStream(fileName);
        f.write(b.toByteArray());
        f.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

