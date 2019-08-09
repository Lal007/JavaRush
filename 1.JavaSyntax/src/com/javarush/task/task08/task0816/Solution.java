package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Krokodilov", df.parse("SEPTEMBER 18 2000"));
        map.put("Korolev", df.parse("JULY 08 2002"));
        map.put("Sidorov", df.parse("JANUARY 18 2000"));
        map.put("Kramorov", df.parse("OCTOBER 18 2000"));
        map.put("Prihodko", df.parse("AUGUST 18 2000"));
        map.put("Beglov", df.parse("NOVEMBER 18 2000"));
        map.put("Navalny", df.parse("MAY 18 2000"));
        map.put("Che", df.parse("DECEMBER 18 2000"));
        map.put("Krupskiy", df.parse("FEBRUARY 18 2000"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        map.values().removeIf(date -> date.getMonth() >= 5 && date.getMonth() <= 7);


    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());

    }
}
