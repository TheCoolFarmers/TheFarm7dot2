package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Structure.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {
    @Test
    public void addHorsesTest() {
        //given
        Stable stable = new Stable();
        Horse horse1 = new Horse("Bella");
        Horse horse2 = new Horse("Tucker");
        Horse horse3 = new Horse("Fancy");
        Integer expected = 3;
        //when
        stable.add(horse1);
        stable.add(horse2);
        stable.add(horse3);
        Integer actual = stable.getCount();
        //then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeHorsesTest() {
        //given
        Stable stable = new Stable();
        Horse horse1 = new Horse("Bella");
        Horse horse2 = new Horse("Tucker");
        Horse horse3 = new Horse("Fancy");
        Integer expected = 2;
        //when
        stable.add(horse1);
        stable.add(horse2);
        stable.add(horse3);
        stable.remove(horse2);
        Integer actual = stable.getCount();
        //then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getByNameTest() {
        //given
        Stable stable = new Stable();
        Horse horse1 = new Horse("Bella");
        Horse horse2 = new Horse("Tucker");
        Horse horse3 = new Horse("Fancy");
        Integer expected = 3;
        //when
        stable.add(horse1);
        stable.add(horse2);
        stable.add(horse3);
        Horse actual = stable.getByName("Tucker");
        //then
        Assert.assertNotNull(actual);

    }

}
