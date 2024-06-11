package org.geunskoo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class CarsTest {

    @Test
    @DisplayName("자동차들 간의 위치값을 비교하여 우승자들을 구할 수 있다.")
    public void create(){
        Car carA = new Car("a", 7);
        Car carB = new Car("b", 7);
        Car carC = new Car("c", 0);
        Cars cars = new Cars(Arrays.asList(carA, carB, carC));

        List<Car> winnerCars = cars.findWinners();

        assertThat(winnerCars).containsExactly(carA, carB);
    }

}
