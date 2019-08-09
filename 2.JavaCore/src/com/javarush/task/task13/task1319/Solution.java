package com.javarush.task.task13.task1319;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();

        ArrayList<String> list = new ArrayList<>();

        for (;;){
            String s = reader.readLine();
            if (s.equals("exit")) {
                list.add("exit");
                break;
            }

            list.add(s);
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

        for (String str:list) {
            writer.write(str + "\n");
        }

        writer.close();
    }
}
