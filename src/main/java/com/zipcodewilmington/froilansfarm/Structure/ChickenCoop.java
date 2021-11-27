package com.zipcodewilmington.froilansfarm.Structure;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop implements Structure<Chicken>{

    private List<Chicken> chickenList = new ArrayList<>();

    @Override
    public void add(Chicken chicken) {
    chickenList.add(chicken);
    }

    @Override
    public void remove(Chicken chicken){
    chickenList.remove(chicken);
    }

    @Override
    public Chicken getByName(String name) {
        for(Chicken chicken : chickenList){
           if(chicken.getName().equals(name)){
               return chicken;
           }
        }
        return null;
    }
}
