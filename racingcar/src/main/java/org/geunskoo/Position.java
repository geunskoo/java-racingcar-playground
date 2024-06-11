package org.geunskoo;

import java.util.Objects;

public class Position {

    private static final int LOW_BOUND_ARGUMENT = 0;
    private static final int MOVE_VALUE = 1;

    private final int position;

    public Position(int position) {
        validateArgument(position);
        this.position = position;
    }

    private void validateArgument(int position) {
        if (position < LOW_BOUND_ARGUMENT){
            throw new IllegalArgumentException("위치 값은 음의 정수 값이 될 수 없습니다.");
        }
    }

    public Position increase() {
        return new Position(this.position + MOVE_VALUE);
    }

    public boolean greaterThan(Position position) {
        return this.position > position.position;
    }

    @Override
    public String toString() {
        return "-".repeat(position);
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
