package ru.specialist.lab11;

import java.util.List;

public class Scene {
    private List<Shape> objects;

    public Scene(List<Shape> objects) {
        this.objects = objects;
    }
    public Scene() {

    }

    public List<Shape> getObjects() {
        return objects;
    }

    public void setObjects(List<Shape> objects) {
        this.objects = objects;
    }

    public void draw(){
        objects.forEach(o->o.draw());
    }

}
