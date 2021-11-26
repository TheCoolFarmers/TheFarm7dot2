package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal implements Rideable {

    public Horse(String name) {
        super(name);
    }

    public String makeNoise() {
        return "Neigh!";
    }

    public void eat(Edible object) {

    }

    public Boolean hasRider(){

        return (Boolean) true;
    }
}
