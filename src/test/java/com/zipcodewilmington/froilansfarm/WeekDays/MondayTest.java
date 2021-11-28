package com.zipcodewilmington.froilansfarm.WeekDays;

import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.Tomato;
import com.zipcodewilmington.froilansfarm.Farmers.Froilanda;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MondayTest {

    private Froilanda froilanda;
    private CropRow crop;
    private List<CropRow> cropRow;
    private Crop cornStalk;
    private CropDuster cropDuster;

    @Before
    public void setUp(){
        this.froilanda = new Froilanda("Froilanda");
        this.crop = new CropRow();
        this.cropRow = new ArrayList<>();
        this.cropDuster = new CropDuster();
        this.cornStalk = new CornStalk();

    }

    @Test
    public void testFly() {
        Assert.assertFalse(froilanda.hasAirCraft());
        //given
        //when
        froilanda.fly(cropDuster);
        Boolean actual = froilanda.hasAirCraft();
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFertilize(){
        //given
        //when
        cropRow.add(crop);
        cropRow.add(crop);
        Integer expected = 2;
        cropDuster.fertilize(cropRow.get(0));
        cropDuster.fertilize(cropRow.get(1));
        //then
        Integer actual = cropDuster.getCountOfFertilizedCrops();
        Assert.assertEquals(expected, actual);
    }



}