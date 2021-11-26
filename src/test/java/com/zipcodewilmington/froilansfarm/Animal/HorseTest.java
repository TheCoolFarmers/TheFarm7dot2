package com.zipcodewilmington.froilansfarm.Animal;

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
    public void eat() {
        //given
        //when
        //then

    }

    @Test
    public void hasRider() {
        //given
        //when

        //then
        Assert.assertTrue(horse.hasRider());
    }
}