package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human children1 = new Human();
        children1.name = "Filya";
        children1.age = 2;
        children1.sex = true;

        Human children2 = new Human();
        children2.name = "Kirya";
        children2.sex = true;
        children2.age = 4;

        Human children3 = new Human();
        children3.name = "Katya";
        children3.sex = false;
        children3.age = 3;

        Human father = new Human();
        father.name = "Egor";
        father.sex = true;
        father.age = 63;
        father.children.add(children1);
        father.children.add(children2);
        father.children.add(children3);

        Human mother = new Human();
        mother.name = "Alyona";
        mother.sex = false;
        mother.age = 59;
        mother.children.add(children1);
        mother.children.add(children2);
        mother.children.add(children3);

        Human grandFather1 = new Human();
        grandFather1.name = "Petya";
        grandFather1.sex = true;
        grandFather1.age = 100;
        grandFather1.children.add(father);

        Human grandFather2 = new Human();
        grandFather2.name = "Kostya";
        grandFather2.sex = true;
        grandFather2.age = 98;
        grandFather2.children.add(mother);

        Human grandMother1 = new Human();
        grandMother1.name = "Klava";
        grandMother1.sex = false;
        grandMother1.age = 96;
        grandMother1.children.add(father);

        Human grandMother2 = new Human();
        grandMother2.name = "Lusya";
        grandMother2.sex = false;
        grandMother2.age = 94;
        grandMother2.children.add(mother);


        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);


    }

    public static class Human {
        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        /*public void setChildren(Human children){
            this.children.add(children);
        }*/

        /*public Human(String name, boolean sex, int age, Human children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(children);
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        */

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
