package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileInputStream(reader.readLine()));

        ArrayList<Integer> arrayList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int temp = scanner.nextInt();
            if (temp % 2 == 0) {
                arrayList.add(temp);
            }
        }
        scanner.close();
        reader.close();
        Collections.sort(arrayList);
        for (Integer arr : arrayList) {
            System.out.println(arr);
        }


    }
}
