package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int f = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, f);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int f) {
        int[] arr = {a, b, c , d, f};
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if (arr[j-1] > arr[j]){
                    int buff = arr[j];
                    arr[j] = arr[j+1];
                    arr[j-1] = buff;
                }
            }
        }
        int result = arr[0];

        return result;

    }
}
