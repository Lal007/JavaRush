package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Sidorov", 500);
        map.put("Petrov", 1500);
        map.put("Kopzov", 435);
        map.put("Zdanov", 7500);
        map.put("Lomov", 3510);
        map.put("Nesterov", 3500);
        map.put("Matveev", 360);
        map.put("Gariv", 2240);
        map.put("Morozov", 2500);
        map.put("Dornov", 154);
            return map;
        
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(tmp -> tmp.getValue() < 500);

        for (Map.Entry<String, Integer> pair:map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " " + value);
        }


    }



    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}