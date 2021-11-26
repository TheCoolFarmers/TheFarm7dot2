package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Rider;

public abstract class AirCraft implements Vehicle{


    protected Rider rider;


    public String fly() {
        return "Ready for Takeoff!";
    }


    public boolean canRide() {
        return true;
    }
}
