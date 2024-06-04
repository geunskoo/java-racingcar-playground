import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    @DisplayName("자동차가 전진하면 위치가 1칸 증가해야한다.")
    void car_ShouldForward(){
        Car car = new Car("myCar1", 1);
        int carPosition = car.forward();

        assertThat(carPosition).isEqualTo(2);
    }

    @Test
    @DisplayName("4이상일 경우 좋은 기름이 생성된다.")
    void goodFuel_ShouldOverFour(){
        Fuel goodFuel = new Fuel(5);
        Fuel badFuel = new Fuel(1);
        boolean goodFuelResult = goodFuel.isAbleToUse();
        boolean badFuelResult = badFuel.isAbleToUse();

        assertThat(goodFuelResult).isTrue();
        assertThat(badFuelResult).isFalse();

    }
}
