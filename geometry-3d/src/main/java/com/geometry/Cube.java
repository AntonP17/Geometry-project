package com.geometry;

public class Cube {

    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getVolume() {
        return side * side * side;
    }

    public double getSurfaceArea() {
        return 6 * side * side;
    }
}
