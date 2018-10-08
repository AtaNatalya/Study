package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static{
        threads.add(new FirstThread());
        threads.add(new SecondThread());
        threads.add(new ThirdThread());
        threads.add(new FourthThread());
        threads.add(new FifthThread());

    }

    public static void main(String[] args) {

    }

    public static class FirstThread extends Thread{
        public void run(){
            while(true){

            }

        }
    }

    public static class SecondThread extends Thread{
        public void run(){
            try{
                Thread.sleep(1);

            } catch (InterruptedException e){
                System.out.println("InterruptedException");

            }
        }
    }

    public static class ThirdThread extends Thread{
        public void run(){
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static class FourthThread extends Thread implements Message{
        private  boolean isCancel = false;

        public void run(){
            while(!isCancel){

            }

        }

        public void showWarning(){
            this.isCancel = true;
        }
    }

    public static class FifthThread extends Thread{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int b = 0;

        public void run(){
            while(true){
                try {
                    s = reader.readLine();
                    if(s.equals("N")){
                        System.out.println(b);
                        break;
                    }
                    b += Integer.parseInt(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }
    }







}