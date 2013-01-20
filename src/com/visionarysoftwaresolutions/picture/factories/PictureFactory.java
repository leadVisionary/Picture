package com.visionarysoftwaresolutions.picture.factories;

import com.visionarysoftwaresolutions.picture.BoundingBox;
import com.visionarysoftwaresolutions.picture.Picture;
import com.visionarysoftwaresolutions.picture.Pixel;

public interface PictureFactory {
    Picture create(BoundingBox dimensions, Pixel[] pixels);
}
