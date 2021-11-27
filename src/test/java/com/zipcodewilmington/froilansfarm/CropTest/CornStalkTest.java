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
    
}
