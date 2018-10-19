package com.javarush.task.task25.task2506;

/**
 * Created by user on 10/18/2018.
 */
public class LoggingStateThread extends Thread {

    private Thread thread;

    public LoggingStateThread (Thread thread){
        this.thread = thread;
        setDaemon(true);
    }

    public void run(){
        State state = this.thread.getState();
        System.out.println(state);
        while(state != State.TERMINATED){
            if( state!=this.thread.getState()){
                state = this.thread.getState();
                System.out.println(state);
            }
        }
    }
}
