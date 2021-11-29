package com.zipcodewilmington.froilansfarm.WeekDays;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Crop.*;
import com.zipcodewilmington.froilansfarm.Farmers.Froilan;
import com.zipcodewilmington.froilansfarm.Farmers.Froilanda;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// on Wednesday
// Froilan and Froilanda ride the horses and feed them
// Froilan and Froilanda eat their respective breakfasts
// Froilan rides his tractor
// Froilanda flies in her plane

public class WednesdayTest {

    private Froilan froilan;
    private Froilanda froilanda;
    private Horse horse;
    private EarCorn corn;
    private Tomato tomato;
    private EdibleEgg egg;
    private Tractor tractor;
    private CropDuster cropDuster;

    @Before
    public void setUp(){

        this.froilan = new Froilan("Froilan");
        this.froilanda = new Froilanda("Froilanda");
        this.horse = new Horse("Jake");
        this.corn = new EarCorn();
        this.tomato = new Tomato();
        this.egg = new EdibleEgg();
        this.tractor = new Tractor();
        this.cropDuster = new CropDuster();
    }

    @Test
    public void testRide(){
        //given
        //when
        froilan.ride(horse);
        Boolean actual = froilan.hasRideable();
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testEatFroilan() {
        //given
        //when
        froilan.eat(tomato);
        froilan.eat(tomato);
        froilan.eat(corn);
        froilan.eat(egg);
        froilan.eat(egg);
        froilan.eat(egg);
        froilan.eat(egg);
        froilan.eat(egg);
        Boolean actual = froilan.hasEaten();
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testEatFroilanda() {
        //given
        //when
        froilanda.eat(tomato);
        froilanda.eat(corn);
        froilanda.eat(corn);
        froilanda.eat(egg);
        froilanda.eat(egg);
        Boolean actual = froilanda.hasEaten();
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFroilanRide(){
        //given
        //when
        froilan.ride(tractor);
        Boolean actual = froilan.hasRideable();
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFroilandaFly(){
        //given
        //when
        froilanda.fly(cropDuster);
        Boolean actual = froilanda.hasAirCraft();
        //then
        Assert.assertTrue(actual);
    }

}
