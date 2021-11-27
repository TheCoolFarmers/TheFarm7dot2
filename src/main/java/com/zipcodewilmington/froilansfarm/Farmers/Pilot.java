package com.zipcodewilmington.froilansfarm.Farmers;

import com.zipcodewilmington.froilansfarm.Vehicles.AirCraft;

public class Pilot extends Person {

    private AirCraft airCraft;

    public Pilot(String name) {
        super(name);
    }


    public void fly(AirCraft airCraft){
        this.airCraft = airCraft;
    }

    public Boolean hasAirCraft() {
        if (airCraft == null) {
            return false;
        } else {
            return true;
        }
    }
}
