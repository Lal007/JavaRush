package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
        String line;
        String space = "";

        while ((line = br.readLine()) != null){
            String[] tmp = line.split("\\s+");

            for (String s:tmp) {
                if (s.length() > 6) {
                    bw.write(space);
                    bw.write(s);
                    space = ",";
                }
            }
        }
        br.close();
        bw.close();
    }
}
