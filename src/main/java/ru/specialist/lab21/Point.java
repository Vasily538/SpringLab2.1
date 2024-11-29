package ru.specialist.lab21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Point extends Shape {
    private Coords coords;

    public void draw() {
        System.out.println(String.format("Drawing %s", this));
    }

    @Autowired
    public Point(Coords coords) {
        this.coords = coords;
    }

    public int getX() {
        return coords.getX();
    }

    public int getY() {
        return coords.getY();
    }

    @Value("${point.x}")
    public void setX(int x) {
        coords.setX(x);
    }

    @Value("${point.y}")
    public void setY(int y) {
        coords.setY(y);
    }

    @Override
    public String toString() {
        return String.format("a point with coordinates (%d,%d)", getX(), getY());
    }
}
