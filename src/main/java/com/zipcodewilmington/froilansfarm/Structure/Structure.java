package com.zipcodewilmington.froilansfarm.Structure;

public interface Structure <AnyAnimal>{
    Integer getCount();
    void add(AnyAnimal anyAnimal);
    void remove(AnyAnimal anyAnimal);
    AnyAnimal getByName(String name);


}
