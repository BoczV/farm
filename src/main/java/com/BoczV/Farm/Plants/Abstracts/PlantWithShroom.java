package com.BoczV.Farm.Plants.Abstracts;

import com.BoczV.Farm.Plants.Abstracts.Plant;

import java.util.Random;

public abstract class PlantWithShroom extends Plant {
    protected boolean hasShroom = false;
    protected boolean rot = false;
    protected static Random random = new Random();
    protected int chanceOfBoostProduction;
    protected int amountOfBoostedProduction;
    protected int chanceOfRot;
    protected int amountOfReduceProductionByRot;

    public PlantWithShroom(int amountOfFoodMonthly) {
        super(amountOfFoodMonthly);
    }


    protected void growShroom() {
        hasShroom = true;
    }

    protected void witherShroom() {
        hasShroom = false;
    }

    protected int boostProductionByShroom() {
        int randomNumber = 1 + random.nextInt(101);
        if (chanceOfBoostProduction <= randomNumber) {
            return amountOfBoostedProduction;
        }
        plantRot(randomNumber);
        return 0;
    }

    private void plantRot(int randomNumber) {
        if (chanceOfRot <= randomNumber) {
            rot = true;
            amountOfFoodMonthly -= amountOfReduceProductionByRot;
        }
    }
}
