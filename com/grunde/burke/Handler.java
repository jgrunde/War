package com.grunde.burke;

import java.util.LinkedList;
import java.awt.*;

public class Handler {

    LinkedList<Country> object = new LinkedList<Country>();

    public void tick() {
        for(int i = 0; i < object.size(); i++) {
            Country tempObject = object.get(i);

            tempObject.tick();
        }
    }

    public void render(Graphics g) {
        for(int i = 0; i < object.size(); i++) {
            Country tempObject = object.get(i);

            tempObject.render(g);
        }
    }

    public void addObject(Country object) {
        this.object.add(object);
    }

    public void removeObject(Country object) {
        this.object.remove(object);
    }
}
