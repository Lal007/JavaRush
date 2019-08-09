package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        byte[] buffer = new byte[inputStream.available()];

        while (inputStream.available() > 0){
            inputStream.read(buffer);
        }

        inputStream.close();

        int count1 = 0, all = 0;
        all = buffer.length;

        for (int i = 0; i < buffer.length; i++){
            if (buffer[i] == 32) count1++;

        }

        double tmp = (double) count1/all * 100;
        double result = (double) Math.round(tmp * 100) / 100;
        System.out.println(result);
    }


}
