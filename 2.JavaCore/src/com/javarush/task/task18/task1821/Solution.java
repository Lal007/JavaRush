package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream inputStream = new FileInputStream(fileName);



        int[] buffer = new int[256];
        while (inputStream.available() > 0){
            buffer[inputStream.read()]++;
        }
        inputStream.close();

        for (int i = 0;i < buffer.length; i++){

            if (buffer[i] > 0) {
                System.out.println((char)i + " " + buffer[i]);
            }
        }

    }
}
