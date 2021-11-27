package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Crop.Produce;
import com.zipcodewilmington.froilansfarm.Edible;

public class Chicken extends Animal {


    public Chicken(String name) {
        super(name);
    }



    public String makeNoise() {
        return "Bawk Bawk!";
    }
}
