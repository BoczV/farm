package com.BoczV.Farm.Plants.Abstracts;

public abstract class Plant {
    protected int amountOfFoodMonthly;

    public Plant(int amountOfFoodMonthly){
        this.amountOfFoodMonthly = amountOfFoodMonthly;
    }

    public abstract int produceMonthly(int month);
}
