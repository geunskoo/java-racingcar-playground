package org.geunskoo;

public class Car {

    private final Name name;
    private Position position;

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void move(Movable randomMovable) {
        if (randomMovable.isMovable()){
            this.position = position.increase();
        }
    }

    public boolean isSamePlaced(int position) {
        return this.position.isSame(position);
    }
}
