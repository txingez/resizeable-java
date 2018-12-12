package com.hk2t.resizeable;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                + " has area = "
                + getArea()
                + " and perimeter = "
                + getPerimeter()
                + " which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        double newRadius = getRadius() * percent / 100;
        System.out.println("New radius of Circle = " + newRadius);
    }
}