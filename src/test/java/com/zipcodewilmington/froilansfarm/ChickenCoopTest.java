package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {
    @Test
    public void addChickensTest(){
     //given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken1 = new Chicken("Josh");
        Chicken chicken2 = new Chicken("Leo");
        Chicken chicken3 = new Chicken("Milo");
        Integer expected = 3;
     //when
     chickenCoop.add(chicken1);
     chickenCoop.add(chicken2);
     chickenCoop.add(chicken3);
     Integer actual = chickenCoop.getCount();
     //then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void removeChickensTest(){
        //given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken1 = new Chicken("Josh");
        Chicken chicken2 = new Chicken("Leo");
        Chicken chicken3 = new Chicken("Milo");
        Integer expected = 2;
        //when
        chickenCoop.add(chicken1);
        chickenCoop.add(chicken2);
        chickenCoop.add(chicken3);
        chickenCoop.remove(chicken2);
        Integer actual = chickenCoop.getCount();
        //then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getByNameTest(){
        //given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken1 = new Chicken("Josh");
        Chicken chicken2 = new Chicken("Leo");
        Chicken chicken3 = new Chicken("Milo");
        //when
        chickenCoop.add(chicken1);
        chickenCoop.add(chicken2);
        chickenCoop.add(chicken3);
        Chicken actual = chickenCoop.getByName("Leo");
        //then
        Assert.assertNotNull(actual);

    }

}
