package com.zipcodewilmington.froilansfarm.CropTest;

import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.Tomato;
import com.zipcodewilmington.froilansfarm.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TomatoTest {
    private Tomato tomato;
    @Before
    public void before(){
        tomato = new Tomato();
    }

    @Test
    public void isInstanceOfEdible(){
        before();
        Assert.assertTrue(tomato instanceof Edible);
    }
}
