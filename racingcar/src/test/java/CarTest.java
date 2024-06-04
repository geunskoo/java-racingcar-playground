import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    @DisplayName("자동차 좋은 기름을 넣으면 1칸 전진한다.")
    void car_ShouldMove1(){

        Car car = new Car("myCar1", 1);
        Fuel fuel = new Fuel(5);

        int carPosition = car.move(fuel);
        assertThat(carPosition).isEqualTo(2);
    }

    @Test
    @DisplayName("자동차 안 좋은 기름을 넣으면 전진하지 않는다.")
    void car_ShouldNotMove(){

        Car car = new Car("myCar1", 1);
        Fuel fuel = new Fuel(1);

        int carPosition = car.move(fuel);
        assertThat(carPosition).isEqualTo(1);
    }
}
