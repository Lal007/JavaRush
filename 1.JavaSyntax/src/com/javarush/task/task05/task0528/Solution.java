package com.javarush.task.task05.task0528;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        SimpleDateFormat date = new SimpleDateFormat("dd MM y");
        System.out.println(date.format(new Date()));
    }
}
