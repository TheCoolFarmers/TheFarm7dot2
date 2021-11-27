package com.zipcodewilmington.froilansfarm.Farmers;

import com.zipcodewilmington.froilansfarm.*;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Farmers.Person;

public class Farmer extends Rider implements Eater, Botanist {

    public String name;

    public Farmer(String name){
        super(name);

    }



    @Override
    public void plantCrop(CropRow cropRow, Crop crop) {
        cropRow.add(crop);
    }

}
