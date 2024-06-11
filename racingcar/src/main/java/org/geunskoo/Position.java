package org.geunskoo;

public class Position {

    private final int MOVE_VALUE = 1;
    private final int position;

    public Position(int position) {
        this.position = position;
    }

    public Position increase() {
        return new Position(this.position + MOVE_VALUE);
    }

    public boolean isSame(int position) {
        return this.position == position;
    }
}
