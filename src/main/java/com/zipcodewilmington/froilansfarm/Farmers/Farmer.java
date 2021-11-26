package com.zipcodewilmington.froilansfarm.Farmers;

import com.zipcodewilmington.froilansfarm.*;
import com.zipcodewilmington.froilansfarm.Farmers.Person;

public class Farmer extends Rider implements Eater, NoiseMaker {

    public String name;


    public Farmer(String name){
        super(name);

    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat(Edible object) {
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void ride(Rideable rideable) {

    }
}
