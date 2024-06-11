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

    public boolean isSamePlaced(Position position) {
        return this.position.equals(position);
    }

    public Position biggerCarPosition(Position position) {
        if (this.position.greaterThan(position)){
            return this.position;
        }
        return position;
    }

    public String getStringName() {
        return this.name.getValue();
    }
}
