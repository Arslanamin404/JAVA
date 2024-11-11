package com.lab.utils;

import com.lab.shapes.Rectangle;

public class ShapeUtils {
    public static double calculateArea(Rectangle rect) {
        return (rect.getLength() * rect.getBreadth());
    }
}
