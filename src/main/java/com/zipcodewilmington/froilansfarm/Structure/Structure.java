package com.zipcodewilmington.froilansfarm.Structure;

public interface Structure <AnyAnimal>{

    void add(AnyAnimal anyAnimal);
    void remove(AnyAnimal anyAnimal);
    AnyAnimal getByName(String name);


}
