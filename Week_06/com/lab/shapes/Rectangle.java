package com.lab.shapes;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getBreadth() {
        return this.breadth;
    }
}
