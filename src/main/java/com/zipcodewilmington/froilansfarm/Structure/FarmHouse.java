package com.zipcodewilmington.froilansfarm.Structure;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Farmers.Person;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse implements Structure<Person> {
    private List<Person> personList = new ArrayList<>();

    @Override
    public Integer getCount() {
        return personList.size();
    }

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public void remove(Person person) {
        personList.remove(person);
    }

    @Override
    public Person getByName(String name) {
        for (Person person : personList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }
}
