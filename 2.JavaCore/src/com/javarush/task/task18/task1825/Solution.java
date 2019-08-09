package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        ArrayList<String> files = new ArrayList<>();
        TreeMap<Integer, String> parts = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*String fileName = reader.readLine();
        String[] pars = fileName.split(".part");
        int part = Integer.parseInt(pars[1]);
        System.out.println(part);*/

        for (;;){
            String s = reader.readLine();
            if (s.equals("end")) break;
            else files.add(s);
        }
        reader.close();

        String[] outpath = files.get(0).split(".part");
        FileOutputStream outputStream = new FileOutputStream(outpath[0]);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        //System.out.println(outpath[0]);

        for (String s:files) {
            String[] tmp = s.split(".part");
            int part = Integer.parseInt(tmp[1]);
            parts.put(part, s);
        }

        for (Map.Entry<Integer,String> pair:parts.entrySet()) {
            BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream(pair.getValue())));
            String str;
            while ((str = buf.readLine()) != null){
                //outputStream.write(str.getBytes());
                writer.write(str);
            }
            buf.close();
        }

        writer.close();

    }
}
