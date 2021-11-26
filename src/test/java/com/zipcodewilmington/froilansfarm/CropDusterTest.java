package com.zipcodewilmington.froilansfarm;

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
        String expected = "Time for my favorite job--fertilizing!";


        //when
        String actual = cropDuster.fertilize();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFertilize2() {
        //given
        CropDuster cropDuster = new CropDuster();
        String expected = "nahhhh not doing that today";


        //when
        String actual = cropDuster.fertilize();

        //then
        Assert.assertNotEquals(expected, actual);
    }


    @Test
    public void makeNoise1() {
        //given
        CropDuster cropDuster = new CropDuster();
        String expected = "Vrooooooooooom";

        //when
        String actual = cropDuster.makeNoise();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void makeNoise2() {
        //given
        CropDuster cropDuster = new CropDuster();
        String expected = "Choo Choo";

        //when
        String actual = cropDuster.makeNoise();

        //then
        Assert.assertNotEquals(expected, actual);

    }

}
