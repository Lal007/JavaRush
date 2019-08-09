package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {

    }

    static {

        class FirstThread extends Thread {

            @Override
            public void run() {
                for (;;){

                }
            }
        }

        FirstThread first = new FirstThread();
        threads.add(first);

        class SecondThread extends Thread {

            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }

        SecondThread second = new SecondThread();
        threads.add(second);

        class ThirdThread extends Thread {

            @Override
            public void run() {
                for (;;){
                    System.out.println("Ура");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        ThirdThread third = new ThirdThread();
        threads.add(third);

        class FourthThread extends Thread implements Message {

            private boolean isShowWarning = false;

            @Override
            public void showWarning() {
                isShowWarning = true;

            }

            @Override
            public void run() {
                for (;;){
                    if (!isShowWarning){

                    } else return;
                }
            }
        }

        FourthThread four = new FourthThread();
        threads.add(four);

        class FiveThread extends Thread {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> list = new ArrayList<>();
            int result = 0;

            @Override
            public void run() {
                for (;;){
                    try {
                        String s = reader.readLine();
                        if (s.equals("N")){
                            for (int i:list) {
                                result += i;
                            }
                            System.out.println(result);
                        }else {
                            list.add(Integer.parseInt(s));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
            }
        }

        FiveThread five = new FiveThread();
        threads.add(five);
    }
}