package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;

public class Horse extends Animal implements Rideable {

    private Rider rider;

    public Horse(String name) {
        super(name);
    }

    public String makeNoise() {
        return "Neigh!";
    }


    public void setRider(Rider rider) {
        this.rider = rider;
    }

    @Override
    public boolean canRide() {
        return true;
    }

    public Boolean hasRider(){
        if(rider != null) {
            return true;
        }else{
            return false;
        }
    }

}
