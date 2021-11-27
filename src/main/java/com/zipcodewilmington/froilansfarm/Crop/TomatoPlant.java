package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Edible;

public class TomatoPlant extends Crop {
    public Edible yield() {
        return new Tomato();
    }
}
