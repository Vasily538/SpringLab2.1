package ru.specialist.lab21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Scope("singleton")
public class Scene {

    private List<Shape> objects;
    @Autowired
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
