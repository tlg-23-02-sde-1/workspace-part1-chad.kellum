package edu.geometry;

public class ShapeClient implements Shape{

    public static void main(String[] args) {

        Shape shape1 = new Rectangle (3,5);
        Shape shape2 = new Triangle(3,5);
        Shape shape3 = new Circle(5);

        System.out.println("Calculate area of the shapes ");
        shape1.area();
        shape2.area();
        shape3.area();


    }

}