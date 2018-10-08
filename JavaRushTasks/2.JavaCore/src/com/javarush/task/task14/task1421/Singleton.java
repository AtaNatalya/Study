package com.javarush.task.task14.task1421;

/**
 * Created by user on 3/28/2018.
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
