package com.lab.main;

import com.lab.shapes.Circle;
import com.lab.shapes.Rectangle;
import com.lab.utils.ShapeUtils;

public class MainApp {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(50.0, 3.0);
        double rectangle_area = ShapeUtils.calculateArea(myRect);
        double rectangle_perimeter = ShapeUtils.calculatePerimeter(myRect);
        System.err.println("Length: " + myRect.getLength());
        System.out.println("Breadth: " + myRect.getBreadth());
        System.err.println("Area of Rectangle: " + rectangle_area);
        System.err.println("Perimeter of Rectangle: " + rectangle_perimeter);

        Circle circle = new Circle(15);
        double circle_area = ShapeUtils.calculateArea(circle);
        double circle_perimeter = ShapeUtils.calculatePerimeter(circle);
        System.err.println("Area of Circle: " + circle_area);
        System.err.println("Perimeter of Circle: " + circle_perimeter);
    }
}
