package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < alphabet.size(); i++){
            map.put(alphabet.get(i), 0);
        }

        for (String s:list) {
            for (int i = 0; i < s.length(); i++){
                for (int j =0; j < alphabet.size(); j++){
                    if (s.charAt(i) == alphabet.get(j))  {
                        int num = map.get(alphabet.get(j));
                        num++;
                        map.put(alphabet.get(j), num);
                    }
                }
            }
        }



        for (Map.Entry<Character, Integer> pair:map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

}
