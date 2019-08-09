package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String line;
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

        while ((line = br.readLine()) != null){
            String[] tmp = line.split("\\s+");
            for (String s:tmp) {
                if (s.matches(".*\\d+.*")) {
                    bw.write(s);
                    bw.write(" ");
                }
            }
        }

        br.close();
        bw.close();


    }
}
