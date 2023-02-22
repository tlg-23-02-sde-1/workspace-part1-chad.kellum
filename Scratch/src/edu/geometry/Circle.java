package edu.geometry;

public class Circle implements Shape {

    private double radius;
    private double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("The area of the circle is Pi * " + getRadius() + "^2= " + (pi * (getRadius() * getRadius())) + " sq. inches");
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