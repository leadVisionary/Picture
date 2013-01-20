package com.visionarysoftwaresolutions.picture.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import com.visionarysoftwaresolutions.picture.BoundingBox;
import com.visionarysoftwaresolutions.picture.Picture;
import com.visionarysoftwaresolutions.picture.Pixel;
import com.visionarysoftwaresolutions.picture.domain.BasicPicture;
import com.visionarysoftwaresolutions.picture.domain.BasicPixel;
import com.visionarysoftwaresolutions.picture.domain.Screen;

public class PictureTests {
    @Test
    public void canCreateAPicture() {
        int width = 200, height = 200;
        BoundingBox dim = new Screen(width, height);
        Pixel[] pix = new BasicPixel[width*height*3];
        Picture toTest = new BasicPicture(dim,pix);
        assertEquals(dim, toTest.getDimensions());
        assertArrayEquals(pix, toTest.getContents());
    }
}
