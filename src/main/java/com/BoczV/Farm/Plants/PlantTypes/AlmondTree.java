package com.BoczV.Farm.Plants.PlantTypes;

import com.BoczV.Farm.Plants.Abstracts.PlantWithShroom;

public class AlmondTree extends PlantWithShroom {

    public AlmondTree(int amountOfFoodMonthly){
        super(amountOfFoodMonthly);
        chanceOfBoostProduction = 8;
        chanceOfRot = 13;
        amountOfBoostedProduction = 10;
        amountOfReduceProductionByRot = 18;
    }

    public int produceMonthly(int month) {
        growShroom();
        amountOfFoodMonthly += 4;
        amountOfFoodMonthly += boostProductionByShroom();
        witherShroom();
        if(!rot){
            return amountOfFoodMonthly < 40 ? amountOfFoodMonthly * 2 : amountOfFoodMonthly;
        }
        return 0;
    }
}
