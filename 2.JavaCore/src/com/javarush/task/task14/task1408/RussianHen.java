package com.javarush.task.task14.task1408;

class RussianHen extends Hen{

    @Override
    int getCountOfEggsPerMonth() {
        return 2;
    }

    public String getDescription(){
        String describ = super.getDescription();
        return describ + " Моя страна - "+ Country.RUSSIA + "." +  " Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}