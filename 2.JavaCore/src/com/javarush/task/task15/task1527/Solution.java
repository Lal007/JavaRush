package com.javarush.task.task15.task1527;

import javax.management.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String u;
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        URL url = new URL(s);

        u = url.getQuery();

        for (String tmp:u.split("&")) {
            if (tmp.indexOf('=') > 0) {
                int indx = tmp.indexOf('=');
                String key = tmp.substring(0, indx);
                String value = tmp.substring(indx + 1);
                map.put(key,value);
            }
            else {
                String key = tmp;
                map.put(key,null);
            }

        }
        //System.out.println(map.toString());

        for (Map.Entry entry:map.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }

        System.out.println();

        for (Map.Entry entry:map.entrySet()) {
            if (entry.getKey().equals("obj")) {
                try {
                    Solution.alert(Double.parseDouble((String) entry.getValue()));
                } catch (NumberFormatException e) {
                    Solution.alert((String) entry.getValue());
                }
            }
        }



    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
