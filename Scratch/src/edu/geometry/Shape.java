package edu.geometry;

public interface Shape {

    default public void area(){
        System.out.println("All shapes have an area");
    }

}
