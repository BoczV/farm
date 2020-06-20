package com.BoczV.Farm.Plants.PlantTypes;

import com.BoczV.Farm.Plants.Abstracts.PlantWithShroom;
import com.BoczV.Farm.Plants.Evergreen.Evergreen;

public class Spruce extends PlantWithShroom implements Evergreen {


    public Spruce(int amountOfFoodMonthly) {
        super(amountOfFoodMonthly);
        chanceOfBoostProduction = 5;
        chanceOfRot = 4;
        amountOfBoostedProduction = 15;
        amountOfReduceProductionByRot = 20;
    }

    public int produceMonthly(int month) {
        growShroom();
        if(amountOfFoodMonthly < 70){
            amountOfFoodMonthly += 4;
        } else {
            System.out.println(getClass() + " at full production!");
        }
        amountOfFoodMonthly += increaseProduction(month);
        amountOfFoodMonthly += boostProductionByShroom();
        witherShroom();
        if(!rot){
            return amountOfFoodMonthly;
        }
        return 0;
    }

    public int increaseProduction(int month) {
        if(month % 5 == 0){
            return 8;
        }
        return 0;
    }
}
