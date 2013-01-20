package com.visionarysoftwaresolutions.picture.domain;

import com.visionarysoftwaresolutions.picture.Point2D;

public class BasicPoint implements Point2D {
    final int x,y;
    
    public BasicPoint(final int xCordinate, final int yCordinate) {
        x = xCordinate;
        y = yCordinate;
    }
    
    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

}
