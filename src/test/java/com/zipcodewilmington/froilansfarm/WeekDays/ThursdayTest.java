package com.zipcodewilmington.froilansfarm.WeekDays;

import com.zipcodewilmington.froilansfarm.Crop.*;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Farmers.Froilan;
import com.zipcodewilmington.froilansfarm.Farmers.Froilanda;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//farmer Froilan
//eat breakfast
//plantcrops
//harvest crop

public class ThursdayTest {

    private Froilan froilan;
    private Froilanda froilanda;
    private Tractor tractor;
    private List<Edible> edible;
    private CropRow crop;
    private Edible corn;
    private Edible tomato;
    private EdibleEgg egg;
    private List<Edible> newCrop;



    @Before
    public void setUp() {

        this.froilan =new Froilan("froilan");
        this.froilanda =new Froilanda("Froianda");
        this.corn = new EarCorn();
        this.tomato = new Tomato();
        this.egg = new EdibleEgg();
        this.crop = new CropRow();
        this.newCrop = new ArrayList<>();
        this.tractor = new Tractor();


    }


    @Test
    public void testEat(){
        Assert.assertFalse(froilan.hasEaten());
        //given
        //when
        froilan.eat(tomato);
        froilan.eat(egg);
        froilan.eat(egg);
        froilan.eat(corn);
        froilan.eat(corn);
        //then
        Assert.assertTrue(froilan.hasEaten());

    }

    @Test
    public void testDriveTractor(){
        Assert.assertFalse(froilan.hasRideable());
        //given
        //when
        froilan.ride(tractor);
        //then
        Assert.assertTrue(froilan.hasRideable());

    }


    @Test
    public void testHarvest(){
        //given
        //when
        Integer expected = 5;
        newCrop.add(new Tomato()); //anonymous initialization**
        newCrop.add(new EarCorn());
        newCrop.add(new Tomato());
        newCrop.add(new EarCorn());
        newCrop.add(new Tomato());
        //then
        tractor.harvest(newCrop.get(0));
        tractor.harvest(newCrop.get(1));
        tractor.harvest(newCrop.get(2));
        tractor.harvest(newCrop.get(3));
        tractor.harvest(newCrop.get(4));
        Integer actual = tractor.getCountOfHarvestedItems();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void plantCrop() {
        //given
        Integer expected = 3;
        //when
        froilan.plantCrop(crop);
        froilan.plantCrop(crop);
        froilan.plantCrop(crop);
        Integer actual = froilan.cropRowList().size();
        //then
        Assert.assertEquals(expected,actual);
    }
}
