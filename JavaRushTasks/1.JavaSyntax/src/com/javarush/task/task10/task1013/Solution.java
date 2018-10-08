package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name = "";
        private int age;
        private int heigt;
        private int weight;
        private String lastName;
        private String country;

        public Human(String name){
            this.name = name;
        }

        public Human(int age){
            this.age = age;
        }

        public Human(int age, int heigt){
            this.age = age;
            this.heigt = heigt;
        }

        public Human(int age, int heigt, int weight){
            this.age = age;
            this.heigt = heigt;
            this.weight = weight;
        }

        public Human(String name, String lastName){
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, String country){
            this.name = name;
            this.lastName = lastName;
            this.country = country;
        }

        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Human(String lastName, int heigt, String country){
            this.lastName = lastName;
            this.heigt = heigt;
            this.country = country;
        }

        public Human(String name, String lastName, int heigt, String country){
            this.name = name;
            this.lastName = lastName;
            this.heigt = heigt;
            this.country = country;
        }

        public Human(String lastName, int heigt, String country, int age){
            this.lastName = lastName;
            this.heigt = heigt;
            this.country = country;
            this.age = age;
        }
    }
}
