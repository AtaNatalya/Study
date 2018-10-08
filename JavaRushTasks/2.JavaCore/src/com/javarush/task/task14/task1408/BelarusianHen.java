package com.javarush.task.task14.task1408;

/**
 * Created by user on 11/15/2017.
 */
public class BelarusianHen extends Hen {
    public int getCountOfEggsPerMonth(){return 9;}

    public String getDescription(){

        return super.getDescription() +" Моя страна - " + Country.BELARUS +". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
