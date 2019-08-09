package com.javarush.task.task08.task0814;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++){
            set.add(i);
        }
        return set;

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код
        //for (Integer tmp: set) {
        //    if (tmp > 10){
        //        set.remove(tmp);
         //   }
        //}

        ArrayList<Integer> arr = new ArrayList<>();

        for (Integer tmp: set) {
            arr.add(tmp);
            }


        for ( int i = 0; i < arr.size(); i++){
            if (arr.get(i) > 10){
                set.remove(arr.get(i));
            }
        }



        return set;
    }

    public static void main(String[] args) {
        removeAllNumbersGreaterThan10(createSet());



    }
}
