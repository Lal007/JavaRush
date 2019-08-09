package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);

        switch (args[0]){
            case ("-e"):
                byte[] buffer = new byte[inputStream.available()];
            while (inputStream.available() > 0){
                inputStream.read(buffer);
            }
            inputStream.close();

            for (int i = 0; i < buffer.length; i++){
                buffer[i] = crypt(buffer[i]);
            }
            outputStream.write(buffer);
            outputStream.close();
            break;

            case ("-d"):
                byte[] buffer1 = new byte[inputStream.available()];
                while (inputStream.available() > 0){
                    inputStream.read(buffer1);
                }
                inputStream.close();

                for (int i = 0; i < buffer1.length; i++){
                    buffer1[i] = crypt(buffer1[i]);
                }
                outputStream.write(buffer1);
                outputStream.close();
                break;

        }
    }

    public static byte crypt(byte b){
        byte result = (byte) (b ^  42);
        return result;
    }

}
