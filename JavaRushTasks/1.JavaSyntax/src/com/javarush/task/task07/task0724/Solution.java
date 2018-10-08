package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandFather = new Human("one", true, 32);
        Human grandMother = new Human("one", false, 21);
        Human grandFather1 = new Human("second", true, 32);
        Human grandMother1 = new Human("second", false, 21);


        Human one = new Human("one", false, 31, grandFather, grandMother);
        Human two = new Human("two", false, 32, grandFather1, grandMother1);
        Human three = new Human("three", false, 34, grandFather, grandMother);
        Human four = new Human("four", false, 35, grandFather1, grandMother1);
        Human five = new Human("five", false, 36, grandFather, grandMother);

        System.out.println(grandFather.toString());
        System.out.println(grandFather1.toString());
        System.out.println(grandMother.toString());
        System.out.println(grandMother1.toString());
        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(four.toString());
        System.out.println(five.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















