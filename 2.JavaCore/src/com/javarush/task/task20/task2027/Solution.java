package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'u', 'h', 'o', 'm', 'e', 'k'},
                {'e', 'o', 'a', 'e', 'h', 'o'},
                {'m', 'n', 'm', 'r', 'o', 'v'},
                {'i', 'o', 'e', 'e', 'o', 'h'},
                {'h', 'o', 'e', 'e', 'j', 'j'}
        };
        System.out.println(detectAllWords(crossword, "home", "same"));
        /*
        Ожидаемый результат
        home - (5, 3) - (2, 0)
        same - (1, 1) - (4, 1)
         */
    }

    public static ArrayList<Word> result = new ArrayList<>();

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        for (String s:words) {

            int letters = s.length();
            for (int i = 0; i < crossword.length; i++){
                for (int j = 0; j < crossword[i].length; j++){
                    int letterStart = 0;
                    if (crossword[i][j] == s.charAt(letterStart)){

                        //Вправо
                        letterStart = 1;
                        for (int k = j + 1; k < crossword[i].length; k++){
                            if (letterStart < letters && s.charAt(letterStart) == crossword[i][k]){
                                letterStart++;
                                if (letters == letterStart) {
                                    saveWord(s, j, i, k, i);
                                    break;
                                }
                            }
                            else break;
                        }

                        //Влево
                        letterStart = 1;
                        for (int k = j - 1; k >= 0; k--) {
                            if (letterStart < letters && s.charAt(letterStart) == crossword[i][k]){
                                letterStart++;
                                if (letters == letterStart){
                                    saveWord(s, j, i, k, i);
                                    break;
                                }
                            }
                            else break;
                        }

                        //Вниз
                        letterStart = 1;
                        for (int k = i + 1; k < crossword.length; k++) {
                            if (letterStart < letters && s.charAt(letterStart) == crossword[k][j]){
                                letterStart++;
                                if(letters == letterStart) {
                                    saveWord(s, j, i, j, k);
                                    break;
                                }
                            }
                            else break;
                        }

                        //Вверх
                        letterStart = 1;
                        for (int k = i - 1; k >= 0; k--){
                            if (letterStart < letters && s.charAt(letterStart) == crossword[k][j]){
                                letterStart++;
                                if(letters == letterStart) {
                                    saveWord(s, j, i, j, k);
                                    break;
                                }
                            }
                            else break;
                        }

                        //Диагональ вправо-вниз
                        letterStart = 1;
                        for (int k = i + 1, l = j + 1; k < crossword.length; k++, l++){
                            if (l < crossword[i].length && letterStart < letters && s.charAt(letterStart) == crossword[k][l]){
                                letterStart++;
                                if(letters == letterStart) {
                                    saveWord(s, j, i, l, k);
                                    break;
                                }
                            }
                            else break;
                        }

                        //Диагональ вправо-вверх
                        letterStart = 1;
                        for (int k = i - 1, l = j + 1; k >= 0; k--, l++){
                            if (l < crossword[i].length && letterStart < letters && s.charAt(letterStart) == crossword[k][l]){
                                letterStart++;
                                if(letters == letterStart) {
                                    saveWord(s, j, i, l, k);
                                    break;
                                }
                            }
                            else break;
                        }

                        //Диагональ влево-вверх
                        letterStart = 1;
                        for (int k = i - 1, l = j - 1; k >= 0; k--, l--){
                            if (l >= 0 && letterStart < letters && s.charAt(letterStart) == crossword[k][l]){
                                letterStart++;
                                if(letters == letterStart) {
                                    saveWord(s, j, i, l, k);
                                    break;
                                }
                            }
                            else break;
                        }

                        //Диагональ влево-вниз
                        letterStart = 1;
                        for (int k = i + 1, l = j - 1; k < crossword.length; k++, l--){
                            if (l >= 0 && letterStart < letters && s.charAt(letterStart) == crossword[k][l]){
                                letterStart++;
                                if(letters == letterStart) {
                                    saveWord(s, j, i, l, k);
                                    break;
                                }
                            }
                            else break;
                        }

                    }
                }
            }
        }

        return result;
    }

    public static void saveWord(String s, int startJ, int startI, int endJ, int endI){
        Word word = new Word(s);
        word.setStartPoint(startJ, startI);
        word.setEndPoint(endJ, endI);
        result.add(word);
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}