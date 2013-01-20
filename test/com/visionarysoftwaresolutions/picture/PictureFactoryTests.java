package com.visionarysoftwaresolutions.picture;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.visionarysoftwaresolutions.picture.Picture;
import com.visionarysoftwaresolutions.picture.Pixel;
import com.visionarysoftwaresolutions.picture.domain.BasicPixel;
import com.visionarysoftwaresolutions.picture.domain.Screen;
import com.visionarysoftwaresolutions.picture.factories.PictureFactory;

public class PictureFactoryTests {
    PictureFactory toTest;
    int width, height;
    BoundingBox dims;
    Pixel[] results;
    
    @Before
    public void setup() {
        width = 200;
        height = 200;
        dims = new Screen(width,height);
        results = new BasicPixel[width+height];
        toTest = new BasicPictureFactory();
    }
    @Test
    public void canGetAPictureFromADimensionAndByteArray() {
        Picture result = toTest.create(dims, results);
        assertNotNull(result);
    }
}
