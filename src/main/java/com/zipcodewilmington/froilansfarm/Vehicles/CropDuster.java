package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Rider;

import java.util.ArrayList;
import java.util.List;

public class CropDuster extends AirCraft implements FarmVehicle {


    List<CropRow> fertilizedList = new ArrayList<CropRow>();

    public void CropDuster() {

    }

    // CropDuster extends AirCraft, which extends FarmVehicle, which implements Vehicle //

    @Override
    public String fly() {

        return "Ready to dust those crops!";

    }

    public void fertilize(CropRow crop) {

//        return "Time for my favorite job--fertilizing!";
        fertilizedList.add(crop);
    }

    public Integer getCountOfFertilizedCrops() {
        return fertilizedList.size();
    }

    @Override
    public String makeNoise() {
        return "Vrooooooooooom";
    }


    @Override
    public Boolean hasRider() {
        return null;
    }

    @Override
    public void setRider(Rider rider) {

    }
}
