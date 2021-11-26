package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Crop.EarCorn;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {

    private String name = "Mr.Chicken";
    private Chicken chicken;
    @Before
    public void setUp(){
        this.chicken = new Chicken(name);
    }


    @Test
    public void hasEaten() {
        Assert.assertFalse(chicken.hasEaten());
        //given
        //when
        chicken.eat(new EarCorn());
        //then
        Assert.assertTrue(chicken.hasEaten());
    }


    @Test
    public void makeNoise() {
        //given
        //when
        String actual = chicken.makeNoise();
        //then
        Assert.assertEquals("Bawk Bawk!", actual);
    }
}