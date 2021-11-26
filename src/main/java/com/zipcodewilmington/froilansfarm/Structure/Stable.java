package com.zipcodewilmington.froilansfarm.Structure;

import com.zipcodewilmington.froilansfarm.Animal.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable implements Structure<Horse>{
private List<Horse> horseList = new ArrayList<Horse>();

    public void add(Horse horse) {
     horseList.add(horse);
    }

    public void remove(Horse horse) {
        horseList.remove(horse);
    }

    @Override
    public Horse getByName(String name) {
        return null;
    }


//    public Horse getByName(String name) {
//        for (Horse horse : horseList){
//           if(horse.getName().equals(name)){
//               return horse;
//           }
//        return null;
//        }


}
