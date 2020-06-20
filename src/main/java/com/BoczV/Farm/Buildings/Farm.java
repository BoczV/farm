package com.BoczV.Farm.Buildings;

import com.BoczV.Farm.Plants.Abstracts.Plant;

import java.util.HashSet;
import java.util.Set;

public class Farm {
    private Set<Plant> plants = new HashSet<Plant>();
    private int amountOfFood = 0;

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void produceFoodForEightyMonth(){
        for(int i = 0; i < 80; i++){
            int monthlyFood = collectMonthlyProduction(i);
            amountOfFood += monthlyFood;
        }
        System.out.println("We produced " + amountOfFood + " pieces of food.");
    }


    private int collectMonthlyProduction(int i){
        int monthlyFood = 0;
        for(Plant plant: plants){
            int plantProduction = plant.produceMonthly(i);
            if(plantProduction > 0){
                monthlyFood += plantProduction;
            } else {
                monthlyFood = 0;
                break;
            }
        }
        return monthlyFood;
    }
}
