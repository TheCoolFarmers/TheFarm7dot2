package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import org.junit.Assert;
import org.junit.Test;

public class FarmTest {
    @Test
    public void chickenCoopTest() {
        //given
        Farm farm = new Farm();
        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        ChickenCoop chickenCoop3 = new ChickenCoop();
        ChickenCoop chickenCoop4 = new ChickenCoop();

        Integer expected = 4;
        //when
        farm.addChickenCoop(chickenCoop1);
        farm.addChickenCoop(chickenCoop2);
        farm.addChickenCoop(chickenCoop3);
        farm.addChickenCoop(chickenCoop4);

        Integer actual = farm.chickenSize();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void StableTest() {
        //given
        Farm farm = new Farm();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();
        Integer expected = 3;
        //when
       farm.addStable(stable1);
       farm.addStable(stable2);
       farm.addStable(stable3);
        Integer actual = farm.stableSize();
        //then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void FarmHouseTest() {
        //given
        Farm farm = new Farm();
        Integer expected = 1;
        //when
        Integer actual = farm.farmHouseSize();
        //then

        Assert.assertEquals(expected, actual);
    }

}
