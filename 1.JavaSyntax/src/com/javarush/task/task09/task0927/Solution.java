package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<>();
        map.put("Vaska", new Cat("Vaska"));
        map.put("Puh", new Cat("Puh"));
        map.put("Rizhiy", new Cat("Rizhiy"));
        map.put("Usat", new Cat("Usat"));
        map.put("Chernish", new Cat("Chernish"));
        map.put("Lenivets", new Cat("Lenivets"));
        map.put("Max", new Cat("Max"));
        map.put("Garfild", new Cat("Garfild"));
        map.put("Monday", new Cat("Monday"));
        map.put("Sunny", new Cat("Sunny"));

        return map;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> set = new HashSet<>();
        for (HashMap.Entry<String, Cat> pair:map.entrySet()) {
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
