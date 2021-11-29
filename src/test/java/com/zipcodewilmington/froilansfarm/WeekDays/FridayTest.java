package com.zipcodewilmington.froilansfarm.WeekDays;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Crop.EarCorn;
import com.zipcodewilmington.froilansfarm.Crop.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Farmers.Froilan;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FridayTest {
    private Froilan froilan;
    private Tractor tractor;
    private Edible earCorn;
    private Edible eggs;
    private Rideable horse;

    @Before
    public void setUp() {
        this.froilan = new Froilan("Froilan");
        this.tractor = new Tractor();
        this.earCorn = new EarCorn();
        this.eggs = new EdibleEgg();
        this.horse = new Horse("Horsey");
    }

    @Test
    public void harvestEarCornTest() {
        Integer expected = 5;
        //when
        tractor.harvest(earCorn);
        tractor.harvest(earCorn);
        tractor.harvest(earCorn);
        tractor.harvest(earCorn);
        tractor.harvest(earCorn);
        Integer actual = tractor.getCountOfHarvestedItems();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatEggsForLunchTest() {
        Integer expectedEggsEaten = 3;
        //when
        froilan.eat(eggs);
        froilan.eat(eggs);
        froilan.eat(eggs);
        Integer actual = froilan.getMealsEaten();
        //then
        Assert.assertEquals(expectedEggsEaten, actual);
    }

    @Test
    public void rideHorseTest() {
        //when
        froilan.ride(horse);
        Boolean actual = froilan.hasRideable();
        //then
        Assert.assertTrue(actual);
    }
}
