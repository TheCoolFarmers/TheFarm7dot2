package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Crop.EarCorn;
import com.zipcodewilmington.froilansfarm.Farmers.Farmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {

    private String name = "Horsey";
    private Horse horse;

    @Before
    public void setUp() {
        this.horse = new Horse(name);
    }

    @Test
    public void makeNoise() {
        //given
        //when
        String actual = horse.makeNoise();
        //then
        Assert.assertEquals("Neigh", actual);

    }

    @Test
    public void testGetName(){
        //given
        //when
        //then
        Assert.assertEquals(name, horse.getName());
    }


    @Test
    public void testHasEaten() {
        Assert.assertFalse(horse.hasEaten());
        //given
        //when
        horse.eat(new EarCorn());
        //then
        Assert.assertTrue(horse.hasEaten());

    }

    @Test
    public void hasRider() {
        Assert.assertFalse(horse.hasRider());
        //given
        //when
        horse.setRider(new Farmer("Dave"));
        //then
        Assert.assertTrue(horse.hasRider());
    }
}