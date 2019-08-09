package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (;;) {
            String fileName = "";
            try {
                fileName = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                FileInputStream inputStream = new FileInputStream(fileName);
                if (inputStream.available() < 1000){
                    reader.close();
                    inputStream.close();
                    throw new DownloadException();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

    public static class DownloadException extends Exception {

    }
}
