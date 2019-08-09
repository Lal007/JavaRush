package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        String[] result = outputStream.toString().split(System.lineSeparator());
        System.setOut(consoleStream);

        int count = 0;

        for (String s:result) {
            if (count != 2) {
                System.out.println(s);
                count++;
            }else {
                System.out.println("JavaRush - курсы Java онлайн");
                System.out.println(s);
                count = 1;
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
