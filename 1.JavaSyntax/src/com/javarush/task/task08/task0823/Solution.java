package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        s = s.trim();

        char[] arr = s.toCharArray();

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[0] == ' ') {
                continue;
            } else arr[0] = Character.toUpperCase(arr[0]);

            if ((arr[i] == ' ') && (arr[i + 1] != ' ')) {
                arr[i + 1] = Character.toUpperCase(arr[i + 1]);

            }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }

            /*if ((s.charAt(i) == ' ')  && (s.charAt(i + 1) != ' ')){
                //if (i + 2 <= s.length()) s = s.replace(s.charAt(i + 2), Character.toUpperCase(s.charAt(i + 2)));
                 s = s.replace(s.charAt(i + 1), Character.toUpperCase(s.charAt(i + 1)));

            }*/

        //s.trim();

        /*for (String tmp : s.split(" ")){
            tmp = tmp.replace(tmp.charAt(0), Character.toUpperCase(tmp.charAt(0)));
            System.out.println(tmp);

        }*/


        //System.out.println(s);
    }
}
