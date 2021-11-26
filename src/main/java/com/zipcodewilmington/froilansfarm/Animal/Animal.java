package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements NoiseMaker, Eater {

    private String name;
    private Integer id;
    private ArrayList<Edible> mealsEaten;


    public Animal(String name, Integer id){
            this.name = name;
            this.id = id;
            this.mealsEaten = new ArrayList<>();
    }

    public Boolean hasEaten(){

        return (Boolean) true;
    }

}
