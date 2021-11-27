package com.zipcodewilmington.froilansfarm.CropTest;

import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EdibleEggTest {
    private EdibleEgg egg;
    @Before
    public void before(){
        egg = new EdibleEgg();
    }

    @Test
    public void isInstanceOfEdible(){
        before();
        Assert.assertTrue(egg instanceof Edible);
    }
}
