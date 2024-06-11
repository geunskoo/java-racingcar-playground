package org.geunskoo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("자동차가 움직이면 위치 값이 1 증가한다.")
    void carPosition_ShouldIncrease(){
        Car carA = new Car("carA", 0);
        Car carB = new Car("carB", 0);

        carA.move(() -> true);
        carA.move(() -> true);
        carB.move(() -> false);

        assertThat(carA.isSamePlaced(new Position(2))).isTrue();
        assertThat(carB.isSamePlaced(new Position(0))).isTrue();
    }

    @Test
    @DisplayName("자동차 위치 값에 음수 입력 시 예외가 발생한다.")
    void Exception_ShouldOccurNotBoundRangeNumber(){
        assertThatThrownBy(
                () -> new Position(-1)
        ).isInstanceOf(IllegalArgumentException.class);
    }

}