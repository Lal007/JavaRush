package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();

        FileInputStream firstInputStream = new FileInputStream(file2);
        FileInputStream secondInputStream = new FileInputStream(file3);

        FileOutputStream outputStream = new FileOutputStream(file1, true);

        if (firstInputStream.available() > 0){
            byte[] buffer1 = new byte[firstInputStream.available()];
            firstInputStream.read(buffer1);
            outputStream.write(buffer1);
        }
        firstInputStream.close();

        if (secondInputStream.available() > 0){
            byte[] buffer2 = new byte[secondInputStream.available()];
            secondInputStream.read(buffer2);
            outputStream.write(buffer2);
        }
        secondInputStream.close();
        outputStream.close();


    }
}
