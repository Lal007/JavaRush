package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (;;){
            String s = reader.readLine();
            try {
                int num = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                if (s.equals("exit")) break;
                else if (s.contains(".")){
                    try {
                        print(Double.parseDouble(s));
                    } catch (NumberFormatException e1) {
                        print(s);
                    }
                    continue;
                }
                else {
                    print(s);
                    continue;
                }
            }


            if (Integer.parseInt(s) > 0 && Integer.parseInt(s) < 128){
                print((short)Integer.parseInt(s));
            }
            else if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128){
                print(Integer.parseInt(s));
            }

        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
