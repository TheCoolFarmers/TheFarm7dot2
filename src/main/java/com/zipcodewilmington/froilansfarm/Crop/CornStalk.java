package com.zipcodewilmington.froilansfarm.Crop;


import com.zipcodewilmington.froilansfarm.Edible;

public class CornStalk extends Crop {
    @Override
    public Edible yield(){
        if(yieldCheck()){
            this.harvest();
            return new EarCorn();
        }
        return null;
    }

}
