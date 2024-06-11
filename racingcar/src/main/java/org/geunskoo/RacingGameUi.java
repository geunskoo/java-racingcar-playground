package org.geunskoo;

import java.util.List;

public class RacingGameUi {


    public void printCars(Cars finishedCars) {
        System.out.println(finishedCars.toString());
        System.out.println();
    }

    public void winnersCelebrateMessage(List<Car> winners) {
        System.out.println(Cars.convertCommaSeparateNames(winners) + "가 최종 우승했습니다.");
    }

    public void carNameGuideMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public void racingTimesGuideMessage() {
        System.out.println("시도할 회수는 몇회인가요?");
    }
}
