package com.zipcodewilmington.froilansfarm.CropTest;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import org.junit.Before;
import org.junit.Test;

public class CropRowTest {
    private CropRow row;
    private TomatoPlant tomatoPlant;
    @Before
    public void before(){
        row = new CropRow();
        tomatoPlant = new TomatoPlant();
    }
    @Test
    public void addCropTest(){
        //when
        before();

    }
}
