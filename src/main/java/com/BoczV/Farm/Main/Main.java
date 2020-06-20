package com.BoczV.Farm.Main;

import com.BoczV.Farm.Buildings.Farm;
import com.BoczV.Farm.Plants.PlantTypes.AlmondTree;
import com.BoczV.Farm.Plants.PlantTypes.Juniper;
import com.BoczV.Farm.Plants.PlantTypes.Spruce;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        for (int i = 0; i < 2; i++) {
            farm.addPlant(new Juniper(14));
            farm.addPlant(new AlmondTree(50));
            farm.addPlant(new Spruce(26));
        }
        farm.produceFoodForEightyMonth();
    }
    
}
