package com.zipcodewilmington.froilansfarm.WeekDays;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Crop.*;
import com.zipcodewilmington.froilansfarm.Farmers.Farmer;
import com.zipcodewilmington.froilansfarm.Farmers.Froilan;
import com.zipcodewilmington.froilansfarm.Farmers.Froilanda;
import com.zipcodewilmington.froilansfarm.Farmers.Person;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SundayTest {

    private Froilan froilan;
    private Froilanda froilanda;
    private Horse horse;
    private EarCorn corn;
    private Tomato tomato;
    private EdibleEgg egg;
    private Stable stable;
    private CropRow crop;
    private List<Produce> mealsEaten;
    private List<Crop> cropRow;


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
        this.mealsEaten = new ArrayList<>();
        this.cropRow = new ArrayList<>();


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
        Integer expected = 1;
        //when
        froilan.plantCrop(crop);
        Integer actual = froilan.cropRowList().size();
        //then
        Assert.assertEquals(expected,actual);


    }


}