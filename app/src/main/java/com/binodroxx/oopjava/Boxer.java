package com.binodroxx.oopjava;

public class Boxer implements Fighting{

    private int numberOfGloves;
    private int punchspeed;
    private int punchpower;
    private static int stamina;

    public int getNumberOfGloves() {
        return  numberOfGloves;
    }
    public void setNumberOfGloves(int numberOfGloves){
        if(numberOfGloves==0)
        {
            return;
        }
        this.numberOfGloves=numberOfGloves;

    }

    public static int getStamina() {
        return stamina;
    }

    public static void setStamina(int stamina) {
        Boxer.stamina = stamina;
    }

    @Override
    public String throwJab() {
        return "throw faster jab";
    }

    @Override
    public String throwCross() {
        return "throw faster cross";
    }

    @Override
    public String throwHook() {
        return "throw faster hook";
    }

    @Override
    public String throwUpperCut() {
        return "throw faster uppercut";
    }
}





