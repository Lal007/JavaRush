package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        //List<String> addresses = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        while (true) {
            String key = reader.readLine();
            if (key.isEmpty()) break;
            String value = reader.readLine();
            map.put(key, value);
        }

        /*for (HashMap.Entry<String, String> pair :map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }*/

        // Read the house number
        String s = reader.readLine();

        //if (0 <= houseNumber && houseNumber < addresses.size()) {
            //String familyName = addresses.get(houseNumber);
            System.out.println(map.get(s));
        //}
    }
}
