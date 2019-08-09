package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Новиков", "Алексей");
        map.put("Сидоров", "Владимир");
        map.put("Логвинов", "Алексей");
        map.put("Солнцев", "Алексей");
        map.put("Бираев", "Владимир");
        map.put("Заподин", "Алексей");
        map.put("Шока", "Алексей");
        map.put("Злобин", "Юрий");
        map.put("Каршев", "Алексей");
        map.put("Левин", "Алексей");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (HashMap.Entry<String, String> pair:map.entrySet()) {
            if (pair.getValue() == name) count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (HashMap.Entry<String, String> pair:map.entrySet()) {
            if (pair.getKey() == lastName) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        getCountTheSameFirstName(createMap(), "Алексей");
        getCountTheSameLastName(createMap(), "Новиков");

        //System.out.println(getCountTheSameFirstName(createMap(), "Алексей") + " " + getCountTheSameLastName(createMap(), "Новиков"));
    }
}
