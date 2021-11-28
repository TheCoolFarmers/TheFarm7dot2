package com.zipcodewilmington.froilansfarm.WeekDays;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Crop.*;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Farmers.Froilan;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class Tuesday {

    private Tractor tractor;
    private List<Edible> newCrop;
    private Froilan froilan;
    private Crop crop;


    @Before
    public void setUp(){
        this.tractor = new Tractor();
        this.newCrop = new ArrayList<>();
        this.crop = new TomatoPlant();
        this.froilan = new Froilan("Froilan");
    }


    @Test
    public void testTractor(){
        Assert.assertFalse(froilan.hasRideable());
        //given
        //when
        froilan.ride(tractor);
        //then
        Assert.assertTrue(froilan.hasRideable());

    }

    @Test
    public void hasHarvest(){
        //given
        //when
        Integer expected = 3;
        newCrop.add(new Tomato()); //anonymous initialization**
        newCrop.add(new EarCorn());
        newCrop.add(new Tomato());
        //then
        tractor.harvest(newCrop.get(0));
        tractor.harvest(newCrop.get(1));
        tractor.harvest(newCrop.get(2));
        Integer actual = tractor.getCountOfHarvestedItems();
        Assert.assertEquals(expected,actual);
    }
}
