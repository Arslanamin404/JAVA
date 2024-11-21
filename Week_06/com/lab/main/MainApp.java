package com.lab.main;

import com.lab.shapes.Circle;
import com.lab.shapes.Rectangle;
import com.lab.utils.ShapeUtils;

public class MainApp {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(50.0, 3.0);

        double rectangle_area = ShapeUtils.calculateArea(myRect);
        double rectangle_perimeter = ShapeUtils.calculatePerimeter(myRect);

        System.out.println("Length: " + myRect.getLength());
        System.out.println("Breadth: " + myRect.getBreadth());

        System.out.format("Area of Rectangle: %.2f%n", rectangle_area);
        System.out.format("Perimeter of Rectangle: %.2f%n", rectangle_perimeter);

        // ------------------------------------------------------------------------------------------------------------------------

        Circle circle = new Circle(15);
        double circle_area = ShapeUtils.calculateArea(circle);
        double circle_perimeter = ShapeUtils.calculatePerimeter(circle);

        System.out.println("\n\nRadius: " + circle.getRadius());

        System.out.format("Area of Circle: %.2f%n", circle_area);
        System.out.format("Perimeter of Circle: %.2f%n", circle_perimeter);
    }
}
