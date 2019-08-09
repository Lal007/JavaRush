package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = br.readLine()) != null){
            String[] tmp = line.split("\\s+");
            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i].matches("\\d+")){
                    for (Map.Entry pair:map.entrySet()) {
                        if (pair.getKey().equals(Integer.parseInt(tmp[i]))) {
                            tmp[i] = (String) pair.getValue();
                            break;
                        }
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (String s:tmp) {
                sb.append(s).append(" ");
            }

            System.out.println(sb.toString());
        }
        br.close();
    }
}
//C:\test1.txt
