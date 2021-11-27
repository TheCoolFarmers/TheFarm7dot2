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
    @Test
    public void defaultHarvestingStateTest(){
        before();
        Assert.assertFalse(tomatoPlant.getHasBeenHarvested());
    }
    @Test
    public void defaultFertilizingStateTest(){
        before();
        Assert.assertFalse(tomatoPlant.getHasBeenFertilized());
    }
    @Test
    public void fertilizingTest(){
        before();
        tomatoPlant.fertilize();
        Assert.assertTrue(tomatoPlant.getHasBeenFertilized());
    }
    @Test
    public void yieldFail1Test(){
        before();
        Assert.assertNull(tomatoPlant.yield());
    }
    @Test
    public void yieldFail2Test(){
        before();
        tomatoPlant.fertilize();
        tomatoPlant.yield();
        Assert.assertNull(tomatoPlant.yield());
    }
    @Test
    public void yieldPassTest(){
        before();
        tomatoPlant.fertilize();
        Assert.assertNotNull(tomatoPlant.yield());

    }
}
