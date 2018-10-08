package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        TreeSet<String> files = new TreeSet<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f;
        while (!(f = reader.readLine()).equals("end")){
            files.add(f);
        }

//        byte [] data;
//
//        FileOutputStream fos = new FileOutputStream("D:/Study/Java/JavaRushTasks/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/test/Lion.avi");
//        for(String s : files){
//            FileInputStream fileInputStream = new FileInputStream(s);
//            data = new byte[fileInputStream.available()];
//            fileInputStream.read(data);
//            fos.write(data);
//            fileInputStream.close();
//        }
//        fos.close();

        String currentFileName = "";
        String nextName;
        FileOutputStream out = null;
        Iterator<String> iterator =  files.iterator();
        while (iterator.hasNext()) {
            nextName = iterator.next();
            if (!nextName.contains(currentFileName) || currentFileName.equals("")) {
                if (out != null) out.close();
                currentFileName = nextName.substring(0, nextName.lastIndexOf('.'));
                out = new FileOutputStream(currentFileName);
            }
            FileInputStream in = new FileInputStream(nextName);
            byte[] buf = new byte[in.available()];
            while (in.available() > 0) {
                int readed = in.read(buf);
                out.write(buf, 0, readed);
            }
            in.close();
        }
        if (out != null) out.close();
    }

}
