package com.zipcodewilmington.froilansfarm.CropTest;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import org.junit.Before;
import org.junit.Test;

public class CropRowTest {
    private CropRow testRow;
    private Crop testCrop;
    @Before
    public void before(){
        testRow = new CropRow();
        testCrop = new Tomato();
    }
    @Test
    public void addCropTest(){
        //
        before();

    }
}
