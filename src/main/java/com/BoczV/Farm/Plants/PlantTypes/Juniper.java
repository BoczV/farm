package com.BoczV.Farm.Plants.PlantTypes;

import com.BoczV.Farm.Plants.Abstracts.Plant;
import com.BoczV.Farm.Plants.Evergreen.Evergreen;

public class Juniper extends Plant implements Evergreen {


    public Juniper(int amountOfFoodMonthly) {
        super(amountOfFoodMonthly);
    }

    public int increaseProduction(int month) {
        if(month % 5 == 0){
            return 8;
        }
        return 0;
    }

    public int produceMonthly(int month) {
        if(amountOfFoodMonthly < 70){
            amountOfFoodMonthly += 4;
        } else {
            System.out.println(getClass() + " at full production!");
        }
        amountOfFoodMonthly += increaseProduction(month);
        return amountOfFoodMonthly;
    }
}
