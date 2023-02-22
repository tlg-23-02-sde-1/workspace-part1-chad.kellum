package edu.geometry;

public class Circle implements Shape {

    private double radius;
    private double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("The area of a circle is Pi * radius^2= " + (pi * (getRadius() * getRadius())));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}