package com.lab.utils;

import com.lab.shapes.Rectangle;
import com.lab.shapes.Circle;

public class ShapeUtils {
    public static double calculateArea(Rectangle rect) {
        return (rect.getLength() * rect.getBreadth());
    }

    public static double calculateArea(Circle myCircle) {
        return (Math.PI * Math.pow(myCircle.getRadius(), 2));
    }

    public static double calculatePerimeter(Rectangle rect) {
        return (2 * (rect.getLength() + rect.getBreadth()));
    }

    public static double calculatePerimeter(Circle myCircle) {
        return (2 * Math.PI * myCircle.getRadius());
    }
}
