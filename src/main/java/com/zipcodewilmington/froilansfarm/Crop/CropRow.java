package com.zipcodewilmington.froilansfarm.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow {

    private List<Crop> cropRow;

    public CropRow(){
        this.cropRow = new ArrayList<>();

    }

    public void add(Crop crop){
        cropRow.add(crop);
    }

    public List<Crop> getCropRow() {
        return cropRow;
    }
}
