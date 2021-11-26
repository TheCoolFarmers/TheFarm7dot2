package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Structure.Stable;
import org.junit.Assert;
import org.junit.Test;

public class FarmTest {
    @Test
    public void chickenCoopTest() {
        //given
        Farm farm = new Farm();
        Integer expected = 4;
        //when
        Integer actual = farm.chickenSize();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void StableTest() {
        //given
        Farm farm = new Farm();
        Integer expected = 3;
        //when
        Integer actual = farm.stableSize();
        //then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void FarmHouseTest() {
        //given
        Farm farm = new Farm();
        Integer expected = 1;
        //when
        Integer actual = farm.farmHouseSize();
        //then

        Assert.assertEquals(expected, actual);
    }

}
