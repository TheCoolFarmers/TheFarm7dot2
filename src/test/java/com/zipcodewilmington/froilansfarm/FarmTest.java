package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import com.zipcodewilmington.froilansfarm.Structure.Structure;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
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
    public void getFarmHouse() {
        //given
        Farm farm = new Farm();
        //when
        Structure actual = farm.getFarmHouse();
        //then
         Assert.assertNotNull(actual);

    }

    @Test
    public void getField(){
        //given
        Farm farm = new Farm();
        //when
        Field actual = farm.getField();
        //then
        Assert.assertNotNull(actual);
    }

    @Test
    public void getTractorAndBaler(){
      //given
      Farm farm = new Farm();
      //when
        Tractor actualTractor = farm.getTractor();
        Tractor actualBaler = farm.getBaler();
       //then
       Assert.assertNotNull(actualTractor);
       Assert.assertNotNull(actualBaler);

    }

    @Test
    public void getCropDuster(){
        //given
        Farm farm = new Farm();
        //when
        CropDuster actual = farm.getCropDuster();
        //then
        Assert.assertNotNull(actual);

    }

}
