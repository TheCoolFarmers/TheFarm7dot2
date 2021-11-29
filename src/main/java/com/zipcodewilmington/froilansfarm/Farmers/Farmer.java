package com.zipcodewilmington.froilansfarm.Farmers;

import com.zipcodewilmington.froilansfarm.*;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Farmers.Person;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Rider implements Eater, Botanist {

    public String name;
    private List<CropRow> plantedCropRow;

    public Farmer(String name){
        super(name);
        this.plantedCropRow = new ArrayList<>();

    }

    public List<CropRow> cropRowList(){
        return plantedCropRow;
    }

    @Override
    public void plantCrop(CropRow cropRow) {
       plantedCropRow.add(cropRow);
    }

}
