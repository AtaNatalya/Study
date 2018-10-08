package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> files = new ArrayList<>();
        String filepath;

        while(!(filepath = reader.readLine()).equals("exit")){
            files.add(filepath);
        }

        for(String s : files){
            new ReadThread(s).start();
        }

        reader.close();

    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) throws IOException{
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        public void run(){
            try{
                FileInputStream f = new FileInputStream(fileName);
                byte[] buffer = new byte[f.available()];
                f.read(buffer);

                int max = 0;
                byte res = 0;

                TreeMap<Byte, Integer> t = new TreeMap<>();
                for (byte b : buffer){
                    byte s =  b;
                    if(t.containsKey(s )){
                        t.put(s, t.get(s) +1);
                    } else {
                        t.put(s, 1);
                    }
                }

                for(Map.Entry<Byte, Integer> entry : t.entrySet()){
                    if(entry.getValue() > max){
                        max = entry.getValue();
                        res = entry.getKey();
                    }
                }


                resultMap.put(fileName, (int)res);
                f.close();




            }catch (FileNotFoundException f){

            } catch (IOException e){

            }

        }
    }
}
