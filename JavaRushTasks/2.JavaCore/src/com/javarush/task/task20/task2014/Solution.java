package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        File f = File.createTempFile("object", null);
        FileInputStream in = new FileInputStream(f);
        FileOutputStream out = new FileOutputStream(f);

        ObjectOutputStream obj = new ObjectOutputStream(out);

        Solution s1 = new Solution(5);
        obj.writeObject(s1);

        ObjectInputStream inputStream = new ObjectInputStream(in);
        Solution s2 = (Solution) inputStream.readObject();

        if(s1.string.equals(s2.string)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
