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
        System.out.println();
        System.out.println("circle perimetr :' " + circle.getPerimeter());
        System.out.println("circle area : " + circle.getArea());
        System.out.println();
        System.out.println("rectangle perimetr : " + rectangle.getPerimeter());
        System.out.println("rectangle area : " + rectangle.getArea());
        System.out.println();
        System.out.println("triangle perimetr : " + triangle.getPerimeter());
        System.out.println("triangle area : " + triangle.getArea());
        System.out.println("test with geometry-utils : " + ShapeComparator.compareByPerimeter(rectangle, rectangle));
        System.out.println(ShapeComparator.helloFromUtils() + "\n");

        Cube cube = new Cube(3.0);
        System.out.println("test with 3d " + cube.getSide());
        Sphere sphere = new Sphere(3.0);
        System.out.println("test with 3d " + sphere.getRadius());


    }
}
