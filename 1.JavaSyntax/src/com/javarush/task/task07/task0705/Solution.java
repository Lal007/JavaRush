package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[20];
        for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(reader.readLine());
        }
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for(int i = 0; i < 10; i++){
            arr1[i] = num[i];
        }
        for(int i = 0; i < 10; i++){
            arr2[i] = num[i + 10];
        }
        for(int i = 0; i < 10; i++){
            System.out.println(arr2[i]);
        }

    }
}
