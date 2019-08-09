package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[15];
        int chet = 0;
        int nech = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i < arr.length; i++){
            if (i%2 == 0){
                chet += arr[i];
            }
            else nech += arr[i];
        }
        if (chet > nech){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
