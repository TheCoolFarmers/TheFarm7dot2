package com.zipcodewilmington.froilansfarm.Farmers;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

public class Person implements NoiseMaker, Eater {

    @Override
    public void eat(Edible object) {

    }

    @Override
    public String makeNoise() {
        return null;
    }
}
