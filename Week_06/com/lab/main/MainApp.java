package com.lab.main;

import com.lab.shapes.Rectangle;
import com.lab.utils.ShapeUtils;

public class MainApp {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(50.0, 3.0);
        double area = ShapeUtils.calculateArea(myRect);
        System.err.println("Length = " + myRect.getLength());
        System.out.println("Breadth = " + myRect.getBreadth());
        System.err.println("Area = " + area);
    }
}
