package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOneOut = new FileOutputStream(file2);
        FileOutputStream fileTwoOut = new FileOutputStream(file3);

        int size1 = 0, size2 = 0;
        if (fileInputStream.available()% 2 == 0){
            size1 = fileInputStream.available() / 2;
            size2 = fileInputStream.available() - size1;
        }else{
            size1 = (fileInputStream.available() / 2) + 1;
            size2 = fileInputStream.available() - size1;
        }

        int countOne = 0;
        if (fileInputStream.available() > 0){

            byte[] bufferOne = new byte[size1];
            byte[] bufferTwo = new byte[size2];
            countOne = fileInputStream.read(bufferOne);
            fileOneOut.write(bufferOne, 0, countOne);
            int count = fileInputStream.read(bufferTwo);
            fileTwoOut.write(bufferTwo);
        }

        fileInputStream.close();
        fileOneOut.close();
        fileTwoOut.close();

    }
}
