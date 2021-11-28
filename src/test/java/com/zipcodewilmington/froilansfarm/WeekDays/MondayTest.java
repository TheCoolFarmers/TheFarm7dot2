package com.zipcodewilmington.froilansfarm.WeekDays;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Crop.*;
import com.zipcodewilmington.froilansfarm.Farmers.Farmer;
import com.zipcodewilmington.froilansfarm.Farmers.Froilan;
import com.zipcodewilmington.froilansfarm.Farmers.Froilanda;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MondayTest {

    private Froilan froilan;
    private Froilanda froilanda;
    private Horse horse;
    private EarCorn corn;
    private Tomato tomato;
    private EdibleEgg egg;
    private Stable stable;
    private CropRow crop;

    @Before
    public void setUp(){
        this.froilan = new Froilan("froilan");
        this.froilanda = new Froilanda("Froianda");
        this.horse = new Horse("Horsey");
        this.corn = new EarCorn();
        this.tomato = new Tomato();
        this.stable = new Stable();
        this.egg = new EdibleEgg();
        this.crop = new CropRow();
    }


    @Test
    public void ride(){
        //given
        //when
        froilan.ride(horse);
        Boolean actual = froilan.hasRideable();
        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void eat() {
        //given
        //when
        froilan.eat(tomato);
        froilan.eat(tomato);
        froilan.eat(corn);
        froilan.eat(egg);
        Boolean actual = froilan.hasEaten();
        //then
        Assert.assertTrue(actual);

    }


    @Test
    public void plantCrop() {
        //given
        //when
//        froilan.addCrop(crop);
        //then


    }


}