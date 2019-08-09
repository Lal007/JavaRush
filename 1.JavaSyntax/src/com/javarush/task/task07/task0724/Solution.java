package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код

        Human grandFather1 = new Human("Kolya", true, 89);
        Human granFather2 = new Human("Ivan", true, 99);
        Human grandMother1 = new Human("Zina", false, 85);
        Human grandMother2 = new Human("Gala", false, 87);
        Human father = new Human("Kostya", true, 50, grandFather1, grandMother1);
        Human mother = new Human("Alla", false, 49, granFather2, grandMother2);
        Human child1 = new Human("Kirya", true, 6, father, mother);
        Human child2 = new Human("Filya", true, 7, father, mother);
        Human child3 = new Human("Kristya", false, 12, father, mother);

        System.out.println(grandFather1.toString());
        System.out.println(granFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human {
        // напишите тут ваш код

        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.father = father;
            this.mother = mother;
            this.name = name;
            this.sex = sex;
            this.age = age;
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