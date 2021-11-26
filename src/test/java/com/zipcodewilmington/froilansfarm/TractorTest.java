package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void testHarvest1() {
        //given
        Tractor tractor = new Tractor();
        String expected = "I'm gonna harvest till I can't harvest no more.";

        //when
        String actual = tractor.harvest();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testHarvest2() {
        //given
        Tractor tractor = new Tractor();
        String expected = "you think i'm gonna harvest today? nah.";

        //when
        String actual = tractor.harvest();

        //then
        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void makeNoise1() {
        //given
        Tractor tractor = new Tractor();
        String expected = "*tractor sounds*";

        //when
        String actual = tractor.makeNoise();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void makeNoise2() {
        //given
        Tractor tractor = new Tractor();
        String expected = "*racecar sounds*";

        //when
        String actual = tractor.makeNoise();

        //then
        Assert.assertNotEquals(expected, actual);

    }


}
