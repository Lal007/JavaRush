package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(2.5, "Hi");
        labels.put(3.14, "Pi");
        labels.put(6.7, "Di");
        labels.put(4.3, "Doi");
        labels.put(5.7, "njvdf");
    }


    public static void main(String[] args) {

        System.out.println(labels);

    }
}
