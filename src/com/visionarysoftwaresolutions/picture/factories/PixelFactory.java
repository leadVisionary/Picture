package com.visionarysoftwaresolutions.picture.factories;

import com.visionarysoftwaresolutions.picture.BoundingBox;
import com.visionarysoftwaresolutions.picture.Color;
import com.visionarysoftwaresolutions.picture.Pixel;
import com.visionarysoftwaresolutions.picture.Point2D;

public interface PixelFactory {
    Pixel create(Point2D place, Color value);
    Pixel[] pixels(BoundingBox captured);
}
