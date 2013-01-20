package com.visionarysoftwaresolutions.picture;

public interface Picture {
    Pixel[] getContents();
    BoundingBox getDimensions();
}
