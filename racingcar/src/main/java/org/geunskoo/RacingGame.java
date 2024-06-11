package org.geunskoo;

public class RacingGame {

    private final Movable movable;

    public RacingGame(Movable movable){
        this.movable = movable;

    }

    public Cars race(Cars cars) {
        return cars.race(movable);
    }
}
