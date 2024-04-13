package com.lxisoft.rectangle;
public class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Overloaded constructor with length and width parameters
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

