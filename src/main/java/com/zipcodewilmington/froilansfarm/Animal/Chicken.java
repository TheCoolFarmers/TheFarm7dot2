package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Edible;

public class Chicken extends Animal {


    public Chicken(String name) {
        super(name);
    }

    public void eat(Edible object) {
    }

    public Boolean hasEaten(){

        return (Boolean) true;
    }

    public Boolean hasBeenFertilized(){

        return (Boolean) true;
    }

    public String makeNoise() {
        return "Bawk Bawk!";
    }
}
