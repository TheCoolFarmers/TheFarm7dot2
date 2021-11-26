package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Farmers.Person;

public abstract class Rider extends Person {

    private Rideable rideable;

    public Rider(String name) {
        super(name);
    }

    public void ride(Rideable rideable) {
        this.rideable = rideable;
        rideable.setRider(this);
    }


    public Boolean hasRideable(){
        if(rideable == null){
            return false;
        }else{
            return true;
        }

    }



}
