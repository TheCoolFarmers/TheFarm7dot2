package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Farmers.Farmer;
import com.zipcodewilmington.froilansfarm.Farmers.Person;
import com.zipcodewilmington.froilansfarm.Farmers.Pilot;
import com.zipcodewilmington.froilansfarm.Structure.FarmHouse;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {
    @Test
    public void addPersonTest() {
        //given
        FarmHouse farmHouse = new FarmHouse();
        Person person1 = new Farmer("Froilan");
        Person person2 = new Pilot("Froilanda");
        Integer expected = 2;
        //when
        farmHouse.add(person1);
        farmHouse.add(person2);
        Integer actual = farmHouse.getCount();

        //then
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void removePerson() {
        //given
        FarmHouse farmHouse = new FarmHouse();
        Person person1 = new Farmer("Froilan");
        Person person2 = new Pilot("Froilanda");
        Integer expected = 1;
        //when
        farmHouse.add(person1);
        farmHouse.add(person2);
        farmHouse.remove(person2);
        Integer actual = farmHouse.getCount();

        //then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getByName(){
        //given
        FarmHouse farmHouse = new FarmHouse();
        Person person1 = new Farmer("Froilan");
        Person person2 = new Pilot("Froilanda");
        //when
        farmHouse.add(person1);
        farmHouse.add(person2);
        Person actual = farmHouse.getByName("Froilanda");

        //then
        Assert.assertNotNull(actual);
    }

}
