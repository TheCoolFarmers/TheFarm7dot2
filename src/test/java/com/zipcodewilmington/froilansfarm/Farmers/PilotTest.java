package com.zipcodewilmington.froilansfarm.Farmers;

import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PilotTest {
    private String name = "amelia";
    private Pilot pilot;

    @Before
    public void setUp(){
        this.pilot = new Pilot(name);

    }
    @Test
    public void fly() {
        Assert.assertFalse(pilot.hasAirCraft());
        //given
        //when
        pilot.fly(new CropDuster());
        //then
        Assert.assertTrue(pilot.hasAirCraft());
    }


}