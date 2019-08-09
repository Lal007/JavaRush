package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firsFile = reader.readLine();
        String secondFile = reader.readLine();
        reader.close();

        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> second = new ArrayList<>();

        BufferedReader br1 = new BufferedReader(new FileReader(firsFile));
        String line;

        while ((line = br1.readLine()) != null){
            first.add(line);
        }
        br1.close();

        BufferedReader br2 = new BufferedReader(new FileReader(secondFile));
        String line2;
        while ((line2 = br2.readLine()) != null){
            second.add(line2);
        }
        br2.close();

        while (!first.isEmpty() | !second.isEmpty()){
            if (second.isEmpty()){
                lines.add(new LineItem(Type.REMOVED, first.get(0)));
                first.remove(0);
            }
            else if (first.isEmpty()){
                lines.add(new LineItem(Type.ADDED, second.get(0)));
                second.remove(0);
            }
            else if (first.get(0).equals(second.get(0))){
                lines.add(new LineItem(Type.SAME, first.get(0)));
                first.remove(0);
                second.remove(0);
            }
            else if (first.get(1).equals(second.get(0))){
                lines.add(new LineItem(Type.REMOVED, first.get(0)));
                first.remove(0);
            }
            else if (first.get(0).equals(second.get(1))){
                lines.add(new LineItem(Type.ADDED, second.get(0)));
                second.remove(0);
            }
        }

        /*for (int i = 0; i <= size; i++){
            if (first.isEmpty() || second.isEmpty()) break;
            if ((first.get(0).equals(second.get(0)))){
                lines.add(new LineItem(Type.SAME, first.get(0)));
                first.remove(0);
                second.remove(0);
            }
            else if (first.get(1).equals(second.get(0))){
            lines.add(new LineItem(Type.REMOVED, first.get(0)));
            first.remove(0);
            }
            else if (first.get(0).equals(second.get(1))) {
                lines.add(new LineItem(Type.ADDED, second.get(0)));
                second.remove(0);
            }
        }

        if (!first.isEmpty()){
            lines.add(new LineItem(Type.REMOVED, first.get(0)));
            first.remove(0);
        }
        else if (!second.isEmpty()){
            lines.add(new LineItem(Type.ADDED, second.get(0)));
            second.remove(0);
            C:\test1.txt
        }*/

        for (LineItem li:lines) {
            System.out.println(li.type + " " + li.line);
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
