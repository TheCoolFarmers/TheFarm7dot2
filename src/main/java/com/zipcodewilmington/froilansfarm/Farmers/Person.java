package com.zipcodewilmington.froilansfarm.Farmers;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.NoiseMaker;


import java.util.ArrayList;
import java.util.List;

public abstract class Person implements NoiseMaker, Eater {

    private String name;
    private List<Edible> mealsEaten;


    public Person(String name) {
        this.name = name;

        this.mealsEaten = new ArrayList<>();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void eat(Edible object) {
        this.mealsEaten.add(object);
    }

    @Override
    public String makeNoise() {
        return "Howdy";
    }

    @Override
    public Boolean hasEaten() {
        if (mealsEaten.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }


}
