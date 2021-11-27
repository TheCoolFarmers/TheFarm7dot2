package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements NoiseMaker, Eater {

    private String name;
    private ArrayList<Edible> mealsEaten;


    public String getName() {
        return name;
    }

    public Animal(String name){
        this.name = name;
        this.mealsEaten = new ArrayList<>();
    }

    public Boolean hasEaten(){

        if(mealsEaten.isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    public void eat(Edible food){
        mealsEaten.add(food);
    }

}
