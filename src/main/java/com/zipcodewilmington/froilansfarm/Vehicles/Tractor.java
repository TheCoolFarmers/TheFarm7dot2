package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Rider;
import java.util.ArrayList;
import java.util.List;

public class Tractor implements FarmVehicle {

    private Rider rider;
    List<Edible> edibleList = new ArrayList<Edible>();
    Tractor redTractor = new Tractor();
    Tractor greenTractor = new Tractor();

    public void Tractor() {

    }

    // Tractor implements FarmVehicle, which implements Vehicle //

    public void harvest(Edible edible) {

        edibleList.add(edible);
    }

    public Integer getCountOfHarvestedItems() {
        return edibleList.size();
    }

    @Override
    public String makeNoise() {
        return "*tractor sounds*";
    }



    public boolean canRide() {

        return true;
    }

    @Override
    public Boolean hasRider() {
        if(rider != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setRider(Rider rider) {

        this.rider = rider;
    }
}


