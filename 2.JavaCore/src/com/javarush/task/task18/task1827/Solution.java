package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) return;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        int maxIndex = 0;
        String str;
        while ((str = reader1.readLine()) != null){
            int tmp = Integer.parseInt(str.substring(0, 8).trim());
            if (tmp > maxIndex) maxIndex = tmp;
        }

        //System.out.println(maxIndex);

        reader1.close();

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, true)));
        StringBuilder stringBuilder = new StringBuilder();
        String id = ((++maxIndex) + "       ").substring(0, 8);
        String productName = ((args[1] + "                               ").substring(0, 30));
        String price = ((args[2] + "       ").substring(0, 8));
        String quantity = ((args[3] + "   ").substring(0, 4));
        stringBuilder.append(id).append(productName).append(price).append(quantity);

        System.out.println(stringBuilder.toString());
        writer.write((byte) 10);
        writer.write(stringBuilder.toString());
        writer.close();


    }
}
