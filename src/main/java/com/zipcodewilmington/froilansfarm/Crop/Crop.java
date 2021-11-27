package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Edible;

public abstract class Crop implements Produce{
    boolean hasBeenFertilized;
    boolean hasBeenHarvested;
    public Crop(){
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }
    public boolean getHasBeenFertilized(){
        return hasBeenFertilized;
    }
    public boolean getHasBeenHarvested(){
        return hasBeenHarvested;
    }
    public void fertilize(){
        this.hasBeenFertilized = true;
    }
    void harvest(){
        this.hasBeenHarvested = true;
    }
    //Only harvest if it hasn't been harvested yet and, it has been fertilized.
    boolean yieldCheck(){
        return (!this.hasBeenHarvested) && this.hasBeenFertilized;
    }

}
