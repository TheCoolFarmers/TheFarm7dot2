package com.zipcodewilmington.froilansfarm.CropTest;

import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CornStalkTest {
    private CornStalk cornStalk;
    @Before
    public void before(){
        cornStalk = new CornStalk();
    }

    @Test
    public void isInstanceOfCrop(){
        before();
        Assert.assertTrue(cornStalk instanceof Crop);
    }
    @Test
    public void defaultHarvestingStateTest(){
        before();
        Assert.assertFalse(cornStalk.getHasBeenHarvested());
    }
    @Test
    public void defaultFertilizingStateTest(){
        before();
        Assert.assertFalse(cornStalk.getHasBeenFertilized());
    }
    @Test
    public void fertilizingTest(){
        before();
        cornStalk.fertilize();
        Assert.assertTrue(cornStalk.getHasBeenFertilized());
    }
    @Test
    public void yieldFail1Test(){
        before();
        Assert.assertNull(cornStalk.yield());
    }
    @Test
    public void yieldFail2Test(){
        before();
        cornStalk.fertilize();
        cornStalk.yield();
        Assert.assertNull(cornStalk.yield());
    }
    @Test
    public void yieldPassTest(){
        before();
        cornStalk.fertilize();
        Assert.assertNotNull(cornStalk.yield());

    }

}
