package com.lab.shapes;

public class Circle {
    private double radius;

    // default constructor
    public Circle() {
        this.radius = 0;
    }

    // parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

}
