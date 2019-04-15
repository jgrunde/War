package com.grunde.burke;

import java.awt.*;

public class Britan extends Country {
    Handler handler;

    public Britan(int Army, int Navy, int Industry, int Colonies, int Money, ID id) {
        super(Army, Navy, Industry, Colonies, Money, id);
        this.handler = handler;
    }

    public void tick() {

    }

    public void render(Graphics g) {
        if (id == ID.Britan) g.setColor(Color.blue);
        g.fillRect(20, 20, 100, 20);
    }
}
