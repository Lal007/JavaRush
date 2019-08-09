package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream fileOne = new FileInputStream(file1);
        FileInputStream source = new FileInputStream(file2);


        byte[] buffer = new byte[fileOne.available() + source.available()];

        while (fileOne.available() > 0) {

            fileOne.read(buffer, source.available(), fileOne.available());
        }
        fileOne.close();

        while (source.available() > 0) {
            source.read(buffer, 0, source.available());

        }
        source.close();
        FileOutputStream outputStream = new FileOutputStream(file1);
        outputStream.write(buffer, 0, buffer.length);
        outputStream.close();

    }
}
