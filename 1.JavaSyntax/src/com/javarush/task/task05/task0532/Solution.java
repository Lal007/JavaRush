package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int count = Integer.parseInt(reader.readLine());
        int[] arr = new int[count];

        for(int i = 0; i < count; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arr);

        maximum = arr[count-1];

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
