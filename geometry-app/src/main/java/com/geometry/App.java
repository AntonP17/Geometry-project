package com.geometry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println("circle : " + circle.getRadius());
        System.out.println("rectangle : " + rectangle.getWidth() + ", " + rectangle.getHeight());
        System.out.println("triangle : " + triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC());


    }
}
