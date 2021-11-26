package com.zipcodewilmington.froilansfarm.Farmers;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    private String name = "Freddie";
    private Farmer farmer;

    @Before
    public void setUp() {
        this.farmer = new Farmer(name);
    }

    @Test
    public void getName() {
        //given
        //when
        String actual = farmer.getName();
        //then
        Assert.assertEquals(name, actual);
    }

    @Test
    public void eat() {
        Assert.assertFalse(farmer.hasEaten());
        //given
        //when
        farmer.eat(new Tomato());
        //then
        Assert.assertTrue(farmer.hasEaten());
    }

    @Test
    public void ride() {
        Assert.assertFalse(farmer.hasRideable());
        //given
        //when
        farmer.ride(new Horse("Donkey"));
        //then
        Assert.assertTrue(farmer.hasRideable());
    }

    @Test
    public void testPlantCrop(){

        //given
        CropRow cropRow = new CropRow();
        Assert.assertEquals(0,cropRow.getCropRow().size());
        //when
        farmer.plantCrop(cropRow, new CornStalk());
        //then
        Assert.assertEquals(1, cropRow.getCropRow().size());
    }

}