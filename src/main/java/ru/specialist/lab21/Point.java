package ru.specialist.lab11;

public class Point extends Shape {
    private Coords coords;

    public void draw() {
        System.out.println(String.format("Drawing %s",this));
    }

    public Point(Coords coords) {
        this.coords = coords;
    }

    public int getX() {
        return coords.getX();
    }

    public int getY() {
        return coords.getY();
    }

    public void setX(int x) {
        coords.setX(x);
    }

    public void setY(int y) {
        coords.setY(y);
    }

    @Override
    public String toString() {
        return String.format("a point with coordinates (%d,%d)", getX(), getY());
    }
}
