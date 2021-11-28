package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crop.*;

import java.util.ArrayList;
import java.util.List;

public class Field implements Produce <Edible> {
    private List<CropRow> cropRows;


    public Field(){
        this.cropRows = new ArrayList<>();
    }

    public void addCropRow(CropRow cropRow){
        cropRows.add(cropRow);
    }

    public Boolean isFertilized(){

        return (boolean) false;
    }


    @Override
    public Edible yield() {
        return null;
    }


}
