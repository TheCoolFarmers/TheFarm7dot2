package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Structure.FarmHouse;
import com.zipcodewilmington.froilansfarm.Structure.Stable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Farm {
    private List<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>(Arrays.asList(
            new ChickenCoop(),
            new ChickenCoop(),
            new ChickenCoop(),
            new ChickenCoop()));
    private List<Stable> stables = new ArrayList<Stable>(Arrays.asList(
            new Stable(),
            new Stable(),
            new Stable()));
    private List<FarmHouse> farmHouse = new ArrayList<FarmHouse>(Arrays.asList(new FarmHouse()));

    public Integer chickenSize(){

        return chickenCoops.size();
    }


    public Integer stableSize(){

        return stables.size();
    }

    public Integer farmHouseSize(){
        return  farmHouse.size();
    }
}
