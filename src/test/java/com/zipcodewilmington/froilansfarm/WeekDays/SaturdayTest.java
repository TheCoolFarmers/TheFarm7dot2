package com.zipcodewilmington.froilansfarm.WeekDays;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Crop.*;
import com.zipcodewilmington.froilansfarm.Farmers.Froilan;
import com.zipcodewilmington.froilansfarm.Farmers.Froilanda;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SaturdayTest {
    private Froilanda froilanda;
    private Froilan froilan;
    private Horse horse;
    private Tractor tractor;
    private CropDuster cropDuster;

    @Before
    public void setUp(){
        this.froilan = new Froilan("AA");
        this.froilanda = new Froilanda("AAA");
        this.horse = new Horse("A");
        this.tractor = new Tractor();
        this.cropDuster = new CropDuster();
    }

    @Test
    public void rideHorseTest() {
        froilan.ride(horse);
        Assert.assertTrue(froilan.hasRideable());
    }
    @Test
    public void eatTest(){
        for (int i = 0; i < 5; i++) {
            froilan.eat(new EdibleEgg());
        }
        froilan.eat(new Tomato());
        froilan.eat(new Tomato());
        froilan.eat(new EarCorn());
        froilanda.eat(new EarCorn());
        froilanda.eat(new EarCorn());
        froilanda.eat(new Tomato());
        froilanda.eat(new EdibleEgg());
        froilanda.eat(new EdibleEgg());
        Assert.assertTrue(froilan.hasEaten());
        Assert.assertTrue(froilanda.hasEaten());
        }
    @Test
    public void tractorTest() {
        froilan.ride(tractor);
        Assert.assertTrue(froilan.hasRideable());
    }
    @Test
    public void cropDusterTest() {
        froilanda.fly(cropDuster);
        Assert.assertTrue(froilanda.hasAirCraft());
    }
}
