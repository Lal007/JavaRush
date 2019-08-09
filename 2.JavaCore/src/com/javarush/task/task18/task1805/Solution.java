package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        HashSet<Integer> set = new HashSet<>();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            set.add(data);
        }
        fileInputStream.close();

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        for (int i:list) {
            System.out.print(i + " ");
        }
    }
}
