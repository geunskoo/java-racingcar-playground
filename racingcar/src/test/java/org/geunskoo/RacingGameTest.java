package org.geunskoo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class RacingGameTest {

    @Test
    @DisplayName("자동차 경주 race당 모든 자동차들이 움직인다.")
    void racingGame_ShouldMakeCarsMove(){
        RacingGame racingGame = new RacingGame(() -> true);
        Car carA = new Car("A",0);
        Car carB = new Car("B",0);
        Car carC = new Car("C",0);
        Cars cars = new Cars(Arrays.asList(carA,carB,carC));

        Cars finishedCars = racingGame.race(cars);
        List<Car> winners = finishedCars.findWinners();

        assertThat(winners).containsExactly(carA,carB,carC);
    }

    @Test
    @DisplayName("자동차 경주 횟수가 완료된 후 경기 우승자는 반드시 존재한다.")
    void RacingGame_ShouldHaveWinners(){

        RacingGame racingGame = new RacingGame(() -> true);

        Car carA = new Car("A",0);
        Car carB = new Car("B",0);
        Car carC = new Car("C",0);
        Car carD = new Car("D",0);
        Cars cars = new Cars(Arrays.asList(carA,carB,carC, carD));

        int raceTimes= 5;

        Cars winnerCars = racingGame.race(cars, raceTimes);
        List<Car> winners = winnerCars.findWinners();

        assertThat(winners.size()).isGreaterThan(0);
        assertThat(winners).containsExactly(carA, carB, carC, carD);
    }
}
