package org.geunskoo;

import java.util.List;
import java.util.Scanner;

public class RacingGame {

    private final Movable movable;
    private final Scanner scanner;

    public RacingGame(Movable movable){
        this.movable = movable;
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        String carNames = requestCarNames();
        int racingTimes = requestRacingTimes();

        Cars cars = Cars.from(carNames);
        Cars finishedCars = race(cars, racingTimes);
        List<Car> winners = finishedCars.findWinners();

        winnersCelebrateMessage(winners);
    }

    private int requestRacingTimes() {
        racingTimesGuideMessage();
        String s = scanner.nextLine();
        return Integer.parseInt(s);
    }


    private String requestCarNames() {
        carNameGuideMessage();
        String carNames = scanner.nextLine();
        return carNames;
    }

    private void winnersCelebrateMessage(List<Car> winners) {
        System.out.println(Cars.convertCommaSeparateNames(winners) + "가 최종 우승했습니다.");
    }

    private void carNameGuideMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    private void racingTimesGuideMessage() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public Cars race(Cars cars, int raceTimes) {
        Cars finishedCars = new Cars();
        for (int i=0; i < raceTimes; i++){
            finishedCars = race(cars);
        }
        return finishedCars;
    }

    public Cars race(Cars cars) {
        return cars.race(movable);
    }
}
