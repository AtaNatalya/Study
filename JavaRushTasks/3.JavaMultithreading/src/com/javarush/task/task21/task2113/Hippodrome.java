package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 8/21/2018.
 */
public class Hippodrome {
    private List<Horse> horses;

    public static Hippodrome game;

    public List<Horse> getHorses(){
        return horses;
    }

    public Hippodrome (List<Horse> h){
        this.horses = h;
    }

    public void run() throws InterruptedException{
        for(int i = 0; i < 100; i ++){
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        horses.forEach(horse -> horse.move());
    }

    public void print(){
        horses.forEach(horse -> horse.print());
        for(int i = 0; i < 10; i ++){
            System.out.println();
        }
    }

    public Horse getWinner(){
        Horse h = getHorses().get(0);
        for(Horse ho : horses){
            if(ho.getDistance() > h.getDistance()){
                h = ho;
            }
        }
        return h;
    }

    public void printWinner(){
        System.out.println("Winner is  " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException{
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("A", 3, 0));
        game.getHorses().add(new Horse("B", 3, 0));
        game.getHorses().add(new Horse("C", 3, 0));
        game.run();
        game.printWinner();

    }
}
