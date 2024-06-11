package org.geunskoo;

import java.util.List;
import java.util.Scanner;

public class RacingGame {

    private final Movable movable;
    private final Scanner scanner;
    private final RacingGameUi racingGameUi;

    public RacingGame(Movable movable){
        this.movable = movable;
        this.scanner = new Scanner(System.in);
        this.racingGameUi = new RacingGameUi();
    }

    public void start(){
        String carNames = requestCarNames();
        int racingTimes = requestRacingTimes();

        Cars cars = Cars.from(carNames);
        Cars finishedCars = race(cars, racingTimes);
        List<Car> winners = finishedCars.findWinners();

        racingGameUi.winnersCelebrateMessage(winners);
    }

    private int requestRacingTimes() {
        racingGameUi.racingTimesGuideMessage();
        String s = scanner.nextLine();
        return Integer.parseInt(s);
    }


    private String requestCarNames() {
        racingGameUi.carNameGuideMessage();
        String carNames = scanner.nextLine();
        return carNames;
    }

    public Cars race(Cars cars, int raceTimes) {
        Cars finishedCars = new Cars();
        for (int i=0; i < raceTimes; i++){
            finishedCars = race(cars);
            racingGameUi.printCars(finishedCars);
        }
        return finishedCars;
    }

    public Cars race(Cars cars) {
        return cars.race(movable);
    }
}
