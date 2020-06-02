package com.binodroxx.oopjava;

public class KickBoxer implements Fighting{

    private int kickSpeed= 70;
    private int kickPower=50;
     private int punchSpeed=80;
    private int punchPower=100;

    public int getKickSpeed() {
        return kickSpeed;
    }

    public void setKickSpeed(int kickSpeed) {
        this.kickSpeed = kickSpeed;
    }

    public int getKickPower() {
        return kickPower;
    }

    public void setKickPower(int kickPower) {
        this.kickPower = kickPower;
    }

    public int getPunchSpeed() {
        return punchSpeed;
    }

    public void setPunchSpeed(int punchSpeed) {
        this.punchSpeed = punchSpeed;
    }

    public int getPunchPower() {
        return punchPower;
    }

    public void setPunchPower(int punchPower) {
        this.punchPower = punchPower;
    }

    @Override
    public String throwJab() {
        return "throw harder jab";
    }

    @Override
    public String throwCross() {
        return "throw harder cross";
    }

    @Override
    public String throwHook() {
        return "throw harder hook";
    }

    @Override
    public String throwUpperCut() {
        return "throw harder uppercut";
    }
}
