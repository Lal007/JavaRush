package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    public String getDescription(){
        String describ = super.getDescription();
        return describ + " Моя страна - "+ Country.MOLDOVA + "." +  " Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
