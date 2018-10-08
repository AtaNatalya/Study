package com.javarush.task.task14.task1419;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try { //it's second exception
            String[] t = new String[0];
            String s = t[1];

        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        FileInputStream f = null;
        try {//it's third exception
            f = new FileInputStream("C://testreb.txt");

        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {//it's fourth exception
            String s = "text";
            int p = Integer.parseInt(s);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try { //it's fifth exception
            int[] d = new int[-5];

        } catch (Exception e) {
            exceptions.add(e);
        }

        try { //it's sixth exception
            List<Integer> i = new ArrayList<>();
            i.get(5);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try { //it's seventh exception
            Abs j = null;
            j.t = "";

        } catch (Exception e) {
            exceptions.add(e);
        }
        try { //it's ninth exception
            Object ob = new Integer(10);

            // ClassCastException occurs
            System.out.println("The value is " + (String) ob);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try { //it's tenth exception
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);


        } catch (Exception e) {
            exceptions.add(e);
        }

        Class c;
        try {
            c = Class.forName("java.lang.String");
            try {
                Class[] paramTypes = new Class[5];
                Method m = c.getDeclaredMethod("fooMethod", paramTypes);
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                exceptions.add(e);
            }
        } catch (ClassNotFoundException e) {
            // deal with the exception here ...
            e.printStackTrace();
        }
    }


    class Abs {
        String t;
    }
}

