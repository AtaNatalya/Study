package com.javarush.task.task19.task1904;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner){
            this.fileScanner = scanner;
        }

        public Person read() throws IOException{
            String[] s = fileScanner.nextLine().split(" ");
            Calendar c = new GregorianCalendar(Integer.parseInt(s[5]),Integer.parseInt(s[4])-1, Integer.parseInt(s[3]) );

            return new Person(s[1], s[2], s[0], c.getTime());
        }

        public void close() throws IOException{
            this.fileScanner.close();
        }

    }
}
