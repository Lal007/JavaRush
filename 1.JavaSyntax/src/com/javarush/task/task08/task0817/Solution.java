package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> names = new ArrayList<>();


        for(HashMap.Entry<String, String> pair: map.entrySet()){
            String name = pair.getValue();
            names.add(name);
        }



        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j)) && i != j) removeItemFromMapByValue(map, names.get(i));
            }
        }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
