package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int result = 0;
        for(;;){
            s = reader.readLine();
            if(s.equals("сумма")){
                break;
            }
            result += Integer.parseInt(s);
        }

        System.out.println(result);
    }
}
