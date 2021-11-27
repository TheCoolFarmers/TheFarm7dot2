package com.zipcodewilmington.froilansfarm.CropTest;

import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class CropRowTest {
    private CropRow row;
    private Crop tomatoPlant;
    private Crop cornStalk;
    private List<Crop> crops;
    @Before
    public void before(){
        row = new CropRow();
        tomatoPlant = new TomatoPlant();
        cornStalk = new CornStalk();
    }
    @Test
    public void addCropTest(){
        before();
        row.addCrop(cornStalk);
        row.addCrop(tomatoPlant);
        crops = row.getCropList();
        Assert.assertTrue(crops.contains(tomatoPlant));
        Assert.assertTrue(crops.contains(cornStalk));
    }
    @Test
    public void removeCropTest(){
        before();
        row.addCrop(cornStalk);
        row.removeCrop(cornStalk);
        Assert.assertTrue(row.getCropList().isEmpty());
    }
}
