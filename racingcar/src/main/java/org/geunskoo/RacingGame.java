package org.geunskoo;

public class RacingGame {

    private final Movable movable;

    public RacingGame(Movable movable){
        this.movable = movable;
    }

    public Cars start(Cars cars, int raceTimes) {
        Cars finishedCars = new Cars();
        for (int i=0; i < raceTimes; i++){
            finishedCars = this.race(cars);
        }
        return finishedCars;
    }

    public Cars race(Cars cars) {
        return cars.race(movable);
    }
}
