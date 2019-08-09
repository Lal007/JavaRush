package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }

    public String getDescription(){
        String describ = super.getDescription();
        return describ + " Моя страна - "+ Country.UKRAINE + "." +  " Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
