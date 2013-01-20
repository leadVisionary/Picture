package com.visionarysoftwaresolutions.picture.domain;

import com.visionarysoftwaresolutions.picture.Color;
import com.visionarysoftwaresolutions.picture.Pixel;
import com.visionarysoftwaresolutions.picture.Point2D;

public class BasicPixel implements Pixel {
    final Point2D point;
    final Color color;
    
    public BasicPixel(final Point2D pt, final Color c) {
        point = pt;
        color = c;
    }
    
    @Override
    public Point2D point() {
        return point;
    }

    @Override
    public Color color() {
        return color;
    }

}
