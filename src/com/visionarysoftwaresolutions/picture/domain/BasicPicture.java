package com.visionarysoftwaresolutions.picture.domain;

import com.visionarysoftwaresolutions.picture.BoundingBox;
import com.visionarysoftwaresolutions.picture.Picture;
import com.visionarysoftwaresolutions.picture.Pixel;

public class BasicPicture implements Picture {
    private final BoundingBox dimensions;
    private final Pixel[] contents;
    
    public BasicPicture(final BoundingBox dims, final Pixel[] results) {
        contents = results;
        dimensions = dims;
    }
    @Override
    public Pixel[] getContents() {
        return contents;
    }

    @Override
    public BoundingBox getDimensions() {
        return dimensions;
    }

}
