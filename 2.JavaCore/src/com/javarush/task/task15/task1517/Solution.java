package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут

        if (A == 0){
            throw new RuntimeException();
        } else A = 4;
    }

    public static int B = 5;

    public static void main(String[] args) throws Exception{
        System.out.println(B);
    }
}
