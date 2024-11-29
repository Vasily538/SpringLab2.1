package ru.specialist.lab21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Circle extends Shape {

    private Coords center;


    private int radius;

    public void draw() {
        System.out.println(String.format("Drawing %s", this));
    }
    @Autowired()
    public Circle(Coords center,  @Value("${circle.radius}") int radius) {
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
    @Value("${circle.x}")
    public void setX(int x) {
        center.setX(x);
    }
    @Value("${circle.y}")
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
