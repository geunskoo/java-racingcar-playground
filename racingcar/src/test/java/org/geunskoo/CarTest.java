package org.geunskoo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("자동차가 움직이면 위치 값이 1 증가한다.")
    public void carPosition_ShouldIncrease(){
        Car carA = new Car("carA", 0);
        Car carB = new Car("carB", 0);

        carA.move(() -> true);
        carA.move(() -> true);
        carB.move(() -> false);

        assertThat(carA.getPosition()).isEqualTo(2);
        assertThat(carB.getPosition()).isEqualTo(0);
    }

}