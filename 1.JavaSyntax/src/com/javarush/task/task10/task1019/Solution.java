package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (;;) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                map.put(name, id);
            } catch (NumberFormatException e) {
                break;
            }
        }
        for (Map.Entry<String, Integer> pair: map.entrySet()) {
            int id = pair.getValue();
            String name =pair.getKey();
            System.out.println(id + " " + name);
        }

    }
}

