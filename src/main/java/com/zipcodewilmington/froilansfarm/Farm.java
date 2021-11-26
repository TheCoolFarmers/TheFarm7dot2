package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Farmers.Person;
import com.zipcodewilmington.froilansfarm.Structure.FarmHouse;
import com.zipcodewilmington.froilansfarm.Structure.Structure;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.ArrayList;

import java.util.List;

public class Farm {

    private Structure<Person> farmHouse = new FarmHouse();

    private List<Structure<Chicken>> chickenCoops = new ArrayList<>();

    private List<Structure<Horse>> stables = new ArrayList<>();

    private Field field = new Field();

    private Tractor tractor = new Tractor();

    private  Tractor baler = new Tractor();

    private CropDuster cropDuster = new CropDuster();

    public Integer chickenSize(){

        return chickenCoops.size();
    }

    public Integer stableSize(){

        return stables.size();
    }



    public List<Structure<Chicken>> getChickenCoops() {
        return chickenCoops;
    }

    public List<Structure<Horse>> getStables() {
        return stables;
    }

    public Structure<Person> getFarmHouse() {
        return farmHouse;
    }

    public Field getField() {
        return field;
    }

    public Tractor getTractor() {
        return tractor;
    }

    public Tractor getBaler() {
        return baler;
    }

    public CropDuster getCropDuster() {
        return cropDuster;
    }

    public void addChickenCoop(Structure chickenCoop){
       chickenCoops.add(chickenCoop);
    }

    public void addStable(Structure stable){
        stables.add(stable);
    }

}
