package org.geunskoo;

import java.util.Random;

public class Car {

    private final String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void move(Movable randomMovable) {
        if (randomMovable.isMovable()){
            this.position ++;
        }
    }

    public int getPosition() {
        return this.position;
    }
}
