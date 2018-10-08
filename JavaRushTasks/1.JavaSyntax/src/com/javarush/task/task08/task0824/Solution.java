package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> grands1 = new ArrayList<>();
        ArrayList<Human> grands2 = new ArrayList<>();
        ArrayList<Human> childs = new ArrayList<>();
        ArrayList<Human> parents = new ArrayList<>();

        Human child1 = new Human("Child1", true, 5, parents);
        Human child2 = new Human("Child2", false, 4, parents);
        Human child3 = new Human("Child3", true, 7, parents);

        childs.add(child1);
        childs.add(child2);
        childs.add(child3);

        Human pap = new Human("Pap", true, 45, childs);
        Human mom = new Human("Mom", false, 34, childs);

        grands1.add(pap);
        grands2.add(mom);

        Human grand1 = new Human("Grand1", true, 78, grands1);
        Human grand12 = new Human("Grand1", false, 67, grands1);

        Human grand2 = new Human("Grand1", true, 89, grands2);
        Human grand22 = new Human("Grand2", false, 77, grands2);

        System.out.println(grand1.toString());
        System.out.println(grand12.toString());
        System.out.println(grand2.toString());
        System.out.println(grand22.toString());
        System.out.println(pap.toString());
        System.out.println(mom.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
