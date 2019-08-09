package com.javarush.task.task20.task2014;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws Exception {
        System.out.println(new Solution(4));

        OutputStream outputStream = new FileOutputStream("C:\\test1.txt");
        InputStream inputStream = new FileInputStream("C:\\test1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(outputStream);
        ObjectInputStream ois = new ObjectInputStream(inputStream);

        Solution saveObject = new Solution(20);
        oos.writeObject(saveObject);

        Solution loadedObject = new Solution(30);
        loadedObject = (Solution) ois.readObject();

        System.out.println(saveObject);
        System.out.println(loadedObject);

    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
