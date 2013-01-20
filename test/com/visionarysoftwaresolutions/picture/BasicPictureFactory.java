package com.visionarysoftwaresolutions.picture;

import com.visionarysoftwaresolutions.picture.domain.BasicPicture;
import com.visionarysoftwaresolutions.picture.factories.PictureFactory;

class BasicPictureFactory implements PictureFactory {
    @Override
    public Picture create(BoundingBox dimensions, Pixel[] pixels) {
        return new BasicPicture(dimensions, pixels);
    }
}
