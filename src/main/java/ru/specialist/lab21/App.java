package ru.specialist.lab11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("contextXML.xml");
        Scene scene = context.getBean(Scene.class);
        scene.draw();
    }
}
