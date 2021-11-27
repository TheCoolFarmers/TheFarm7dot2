package com.zipcodewilmington.froilansfarm.CropTest;

import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.EarCorn;
import com.zipcodewilmington.froilansfarm.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EarCornTest {
    private EarCorn corn;

    @Before
    public void before() {
        corn = new EarCorn();
    }

    @Test
    public void isInstanceOfEdible() {
        before();
        Assert.assertTrue(corn instanceof Edible);
    }
}
