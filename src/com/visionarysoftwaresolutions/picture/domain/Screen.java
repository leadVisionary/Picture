package com.visionarysoftwaresolutions.picture.domain;

import com.visionarysoftwaresolutions.picture.BoundingBox;

public class Screen implements BoundingBox {
    private final int width,height;
    
    public Screen(final int width, final int height) {
        this.width = setIfNonNegative(width);
        this.height = setIfNonNegative(height);
    }
    
    private int setIfNonNegative(int number) {
        if(number < 0) {
            throw new IllegalArgumentException("cannot have negative dimensions");
        }
        return number;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
