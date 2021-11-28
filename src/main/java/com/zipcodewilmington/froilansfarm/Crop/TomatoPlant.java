package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Edible;

public class TomatoPlant extends Crop {

    @Override
    public Edible yield() {
        if(yieldCheck()){
            this.harvest();
            return new Tomato();
        }
        return null;
    }
}
