package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        return this.age>anotherCat.age;
//        double a = this.age*this.strength/this.weight;
//        double b = anotherCat.age*anotherCat.strength/anotherCat.weight;
//        if(a>b){
//            return true;
//        } else {
//            return false;
//        }
    }

    public static void main(String[] args) {
//
//       Cat cat1 = new Cat();
//       cat1.age = 3;
//       cat1.weight = 5;
//       cat1.strength = 2;
//
//       Cat cat2 = new Cat();
//        cat2.age = 5;
//        cat2.weight = 6;
//        cat2.strength = 9;

    }
}
