package com.zipcodewilmington.froilansfarm.VehiclesTests;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Farmers.Pilot;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {


    @Test
    public void testFly1() {
        //given
        CropDuster cropDuster = new CropDuster();
        String expected = "Ready to dust those crops!";


        //when
        String actual = cropDuster.fly();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFly2() {
        //given
        CropDuster cropDuster = new CropDuster();
        String expected = "Not flying today bruh";


        //when
        String actual = cropDuster.fly();

        //then
        Assert.assertNotEquals(expected, actual);
    }


    @Test
    public void testFertilize1() {
        //given
        CropDuster cropDuster = new CropDuster();
        Integer expected = 2;
        CropRow corn1 = new CropRow();
        CropRow corn2 = new CropRow();
        //when
        cropDuster.fertilize(corn1);
        cropDuster.fertilize(corn2);
        Integer actual = cropDuster.getCountOfFertilizedCrops();


        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFertilize2() {
        //given
        CropDuster cropDuster = new CropDuster();
        Integer expected = 5;
        CropRow corn1 = new CropRow();
        CropRow corn2 = new CropRow();
        //when
        cropDuster.fertilize(corn1);
        cropDuster.fertilize(corn2);
        Integer actual = cropDuster.getCountOfFertilizedCrops();


        //then
        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void testMakeNoise1() {
        //given
        CropDuster cropDuster = new CropDuster();
        String expected = "Vrooooooooooom";

        //when
        String actual = cropDuster.makeNoise();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMakeNoise2() {
        //given
        CropDuster cropDuster = new CropDuster();
        String expected = "Choo Choo";

        //when
        String actual = cropDuster.makeNoise();

        //then
        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void testGetCountOfFertilizedCrops1() {
        //given
        CropDuster cropDuster = new CropDuster();
        CropRow corn1 = new CropRow();
        CropRow corn2 = new CropRow();
        cropDuster.fertilize(corn1);
        cropDuster.fertilize(corn2);
        Integer expected = 2;



        //when
        Integer actual = cropDuster.getCountOfFertilizedCrops();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetCountOfFertilizedCrops2() {
        //given
        CropDuster cropDuster = new CropDuster();
        CropRow corn1 = new CropRow();
        CropRow corn2 = new CropRow();
        cropDuster.fertilize(corn1);
        cropDuster.fertilize(corn2);
        Integer expected = 5;



        //when
        Integer actual = cropDuster.getCountOfFertilizedCrops();

        //then
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void testCanRide1() {
        //given
        CropDuster cropDuster = new CropDuster();


        //when
        boolean actual = cropDuster.canRide();

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testHasRider1() {
        //given
        CropDuster cropDuster = new CropDuster();

        //when
        boolean actual = cropDuster.hasRider();

        //then
        Assert.assertTrue(actual);
    }



}
