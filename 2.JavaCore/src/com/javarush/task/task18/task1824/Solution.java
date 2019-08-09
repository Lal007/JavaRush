package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<FileInputStream> fis = new ArrayList<>();
        for (;;){
            String fileName = reader.readLine();
            try {
                fis.add(new FileInputStream(fileName));
            } catch (FileNotFoundException e) {
                reader.close();
                for (FileInputStream is:fis) {
                    is.close();
                }
                System.out.println(fileName);
                break;
            }
        }
    }
}
