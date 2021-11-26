package com.zipcodewilmington.froilansfarm.Vehicles;

public class Tractor extends FarmVehicle {

    public void Tractor() {

    }


    public String harvest() {
        return "I'm gonna harvest till I can't harvest no more.";
    }


    @Override
    public String makeNoise() {
        return "*tractor sounds*";
    }
}
