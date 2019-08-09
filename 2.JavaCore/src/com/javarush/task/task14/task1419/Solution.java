package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions()  {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код


        try {
            File file = new File("D://java/file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            int[] i = {1,2,3,4};
            int a = i[4];
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            Object[] o = new String[3];
            o[2] = new Integer(1);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        try {
            int[] j = new int[-4];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        Exception exception = new RuntimeException();
        exceptions.add(exception);   //7
        exception = new NullPointerException ();
        exceptions.add(exception);   //8
        exception = new ClassCastException();
        exceptions.add(exception);   //9
        exception = new IllegalArgumentException();
        exceptions.add(exception);   //10
        exception = new UnsupportedOperationException();
        exceptions.add(exception);   //10

    }
}
