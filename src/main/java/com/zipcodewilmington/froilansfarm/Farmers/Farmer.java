package com.zipcodewilmington.froilansfarm.Farmers;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Farmers.Person;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rider;

public class Farmer extends Person implements Rider, Eater, NoiseMaker {

    public String name;

    public Farmer(String name){
        this.name = name;

    }


    @Override
    public void eat(Edible object) {

    }

    @Override
    public String makeNoise() {
        return null;
    }
}
