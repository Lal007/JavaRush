package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        String str;
        while ((str = reader1.readLine()) != null){
            String tmp = str.substring(0, 8).trim();
            map.put(Integer.parseInt(tmp), str);
        }
        reader1.close();

        switch (args[0]){
            case ("-u"):
                int id = Integer.parseInt(args[1]);
                String sId = (args[1] + "         ").substring(0, 8);
                String productName = (args[2] + "                             ").substring(0, 30);
                String price = (args[3] + "        ").substring(0, 8);
                String quantity = (args[4] + "    ").substring(0, 4);

                StringBuilder sb = new StringBuilder();
                sb.append(sId).append(productName).append(price).append(quantity);

                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));

                map.put(id, sb.toString());
                for (Map.Entry<Integer, String> pair:map.entrySet()) {
                    int tmp = pair.getKey();
                    writer.write(pair.getValue());
                    writer.write((byte) 10);

                }
                writer.close();
                break;

            case ("-d"):
                int id1 = Integer.parseInt(args[1]);

                BufferedWriter writer1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));

                for (Map.Entry<Integer, String> pair:map.entrySet()) {
                    int tmp = pair.getKey();
                    if (tmp != id1){
                        writer1.write(pair.getValue());
                        writer1.write((byte) 10);
                    }
                }

                writer1.close();

        }
    }
}
