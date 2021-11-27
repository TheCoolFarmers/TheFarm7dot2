package com.zipcodewilmington.froilansfarm.Farmers;

import com.zipcodewilmington.froilansfarm.Vehicles.AirCraft;

public class Pilot extends Person {

    private AirCraft airCraft;
    Pilot Froilanda = new Pilot();

    public Pilot(String name) {
        super(name);
    }

    public Pilot() {
        super();
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
