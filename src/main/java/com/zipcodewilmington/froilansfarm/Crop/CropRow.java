package com.zipcodewilmington.froilansfarm.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow {

    private List<Crop> crops;

    public CropRow(){
        crops = new ArrayList<Crop>();
    }
    public void addCrop(Crop crop){
        crops.add(crop);
    }
    public void removeCrop(Crop crop) {
        crops.remove(crop);
    }
    public List<Crop> getCropList() {
        return crops;

    }
}
