package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        Integer count = 1;
        Integer tmp = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }



        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))){
                tmp++;
                //tmp > count
                    count = tmp;

            }
            else {
               tmp = 1;
            }
            //count.add(tmp);

        }

        //Collections.sort(count);


            System.out.println(count);


    }
}