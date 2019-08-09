package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        HashMap <Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();


        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            list.add(data);
        }

        fileInputStream.close();
        for (int i:list) {
            int count = Collections.frequency(list, i);
            map.put(i, count);
        }

        int max = 0;

        for (Map.Entry<Integer, Integer> pair:map.entrySet()) {
            int tmp = pair.getValue();
            if (tmp > max) max = tmp;
        }

        for (Map.Entry<Integer, Integer> pair:map.entrySet()) {
            if (pair.getValue() >= max) System.out.print(pair.getKey() + " ");
        }
    }
}
