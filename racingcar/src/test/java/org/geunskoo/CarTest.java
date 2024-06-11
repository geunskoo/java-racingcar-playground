package org.geunskoo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(strings = {"김태근김태근" , ""})
    @DisplayName("자동차 이름 값에 5자리 초과 값과 공백이 올수 없다.")
    void Exception_ShouldOccurBlankNameAndOverLength5(String input){
        assertThatThrownBy(
                () -> new Name(input)
        ).isInstanceOf(IllegalArgumentException.class);
    }

}