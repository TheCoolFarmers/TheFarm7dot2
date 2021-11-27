package com.zipcodewilmington.froilansfarm.CropTest;

import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TomatoPlantTest {
    private TomatoPlant tomatoPlant;
    @Before
    public void before(){
        tomatoPlant = new TomatoPlant();
    }

    @Test
    public void isInstanceOfCrop(){
        before();
        Assert.assertTrue(tomatoPlant instanceof Crop);
    }
}
