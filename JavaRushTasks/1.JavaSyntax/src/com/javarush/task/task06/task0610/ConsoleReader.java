package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();

    }

    public static int readInt() throws Exception {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();

    }

    public static double readDouble() throws Exception {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();

    }

    public static boolean readBoolean() throws Exception {
        Scanner scan = new Scanner(System.in);
        String tmp =  scan.nextLine();
        boolean bool = false;
        if(tmp.equals("true")){
            bool = true;
        } else if(tmp.equals("false")){
            bool = false;
        }
        return bool;
    }

    public static void main(String[] args) {

    }
}
