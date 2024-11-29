package ru.specialist.lab11;

public class Circle extends Shape {
    private Coords center;
    private int radius;

    public void draw() {
        System.out.println(String.format("Drawing %s", this));
    }

    public Circle(Coords center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getX() {
        return center.getX();
    }

    public int getY() {
        return center.getY();
    }

    public int getRadius() {
        return this.radius;
    }

    public void setX(int x) {
        center.setX(x);
    }

    public void setY(int y) {
        center.setY(y);
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    @Override
    public String toString() {
        return String.format("a circle with coordinates (%d,%d) and radius %d", getX(), getY(), getRadius());

    }
}
