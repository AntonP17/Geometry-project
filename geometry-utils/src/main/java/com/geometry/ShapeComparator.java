package com.geometry;


public class ShapeComparator {

    public static int compareByArea(Circle c1, Circle c2) {
        return Double.compare(c1.getArea(), c2.getArea());
    }

    public static int compareByPerimeter(Rectangle r1, Rectangle r2) {
        return Double.compare(r1.getPerimeter(), r2.getPerimeter());
    }



}
