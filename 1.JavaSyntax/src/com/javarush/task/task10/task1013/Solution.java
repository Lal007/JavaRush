package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы

        private String name;
        private int age, weight;
        private double tall;
        private String addres;
        private int iQ;

        public Human (){

        }
        public Human (String name){
            this.name = name;
        }
        public Human (String name, int age){
            this.name = name;
            this.age =age;
        }
        public Human (String name, int age, int weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
        public Human (String name, int age, int weight, double tall){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tall = tall;
        }
        public Human (String name, int age, int weight, double tall, String addres){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tall = tall;
            this.addres = addres;
        }
        public Human (String name, int age, int weight, double tall, String addres, int iQ){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tall = tall;
            this.addres = addres;
            this.iQ = iQ;
        }
        public Human (String name, String addres){
            this.name = name;
            this.addres = addres;
        }
        public Human (String name, int weight, double tall, String addres){
            this.name = name;
            this.weight = weight;
            this.tall = tall;
            this.addres = addres;
        }
        public Human (String name, double tall, String addres){
            this.name = name;
            this.tall = tall;
            this.addres = addres;
        }
    }
}
