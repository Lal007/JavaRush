package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

//C:\1

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        StringBuilder builder = new StringBuilder();

        FileInputStream is = new FileInputStream(file1);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(is));

        String str = "";
        String tmp;
        while ((tmp = reader1.readLine()) != null) {
            //System.out.println(tmp);
            str = tmp;
        }
        reader1.close();

        String prefix = "";
        for (String s:str.split(" ")) {
            //System.out.println(s);
            builder.append(prefix);
            prefix = " ";
            builder.append(Math.round(Double.parseDouble(s)));
        }

        FileOutputStream outputStream = new FileOutputStream(file2);

        byte[] buffer = builder.toString().getBytes();
        outputStream.write(buffer);

        is.close();
        outputStream.close();
    }
}
