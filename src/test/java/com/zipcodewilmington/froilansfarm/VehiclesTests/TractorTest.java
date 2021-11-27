package com.zipcodewilmington.froilansfarm.VehiclesTests;


import com.zipcodewilmington.froilansfarm.Crop.EarCorn;
import com.zipcodewilmington.froilansfarm.Crop.Tomato;
import com.zipcodewilmington.froilansfarm.Edible;

import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void testHarvest1() {
        //given
        Tractor tractor = new Tractor();
        Integer expected = 2;
        Edible tomato1 = new Tomato();
        Edible tomato2 = new Tomato();
        //when
        tractor.harvest(tomato1);
        tractor.harvest(tomato2);
        Integer actual = tractor.getCountOfHarvestedItems();


        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testHarvest2() {
        //given
        Tractor tractor = new Tractor();
        Integer expected = 5;
        Edible tomato1 = new Tomato();
        Edible tomato2 = new Tomato();
        //when
        tractor.harvest(tomato1);
        tractor.harvest(tomato2);
        Integer actual = tractor.getCountOfHarvestedItems();


        //then
        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void testMakeNoise1() {
        //given
        Tractor tractor = new Tractor();
        String expected = "*tractor sounds*";

        //when
        String actual = tractor.makeNoise();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMakeNoise2() {
        //given
        Tractor tractor = new Tractor();
        String expected = "*racecar sounds*";

        //when
        String actual = tractor.makeNoise();

        //then
        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void testGetCountOfHarvestedItems1() {
        //given
        Tractor tractor = new Tractor();
        EarCorn corn1 = new EarCorn();
        EarCorn corn2 = new EarCorn();
        tractor.harvest(corn1);
        tractor.harvest(corn2);
        Integer expected = 2;


        //when
        Integer actual = tractor.getCountOfHarvestedItems();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetCountOfHarvestedItems2() {
        //given
        Tractor tractor = new Tractor();
        EarCorn corn1 = new EarCorn();
        EarCorn corn2 = new EarCorn();
        tractor.harvest(corn1);
        tractor.harvest(corn2);
        Integer expected = 6;


        //when
        Integer actual = tractor.getCountOfHarvestedItems();

        //then
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void testCanRide1() {
        //given
        Tractor tractor = new Tractor();


        //when
        boolean actual = tractor.canRide();

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testHasRider1() {
        //given
        Tractor tractor = new Tractor();

        //when
        boolean actual = tractor.hasRider();

        //then
        Assert.assertNotNull(actual);
    }

}
