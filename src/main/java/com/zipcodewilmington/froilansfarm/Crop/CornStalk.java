package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Edible;

public class CornStalk extends Crop {
    public Edible yield(){
        return new EarCorn();
    }
}
