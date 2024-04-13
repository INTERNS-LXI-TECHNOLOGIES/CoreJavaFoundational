package com.lxisoft.main;
import com.lxisoft.rectangle.Rectangle;
public class Main {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Rectangle defaultRectangle = new Rectangle();
        Rectangle customRectangle = new Rectangle(5, 10);

        // Displaying information about the rectangles
        System.out.println("Default Rectangle - Area: " + defaultRectangle.calculateArea() + ", Perimeter: " + defaultRectangle.calculatePerimeter());
        System.out.println("Custom Rectangle - Area: " + customRectangle.calculateArea() + ", Perimeter: " + customRectangle.calculatePerimeter());
    }
}