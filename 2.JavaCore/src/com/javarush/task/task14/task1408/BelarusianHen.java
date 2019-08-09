package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 7;
    }

    public String getDescription(){
        String describ = super.getDescription();
        return describ + " Моя страна - "+ Country.BELARUS + "." +  " Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
