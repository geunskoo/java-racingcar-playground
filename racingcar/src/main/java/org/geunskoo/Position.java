package org.geunskoo;

import java.util.Objects;

public class Position {

    private final int MOVE_VALUE = 1;
    private final int position;

    public Position(int position) {
        this.position = position;
    }

    public Position increase() {
        return new Position(this.position + MOVE_VALUE);
    }

    public boolean greaterThan(Position position) {
        return this.position > position.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return MOVE_VALUE == position1.MOVE_VALUE && position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(MOVE_VALUE, position);
    }
}
