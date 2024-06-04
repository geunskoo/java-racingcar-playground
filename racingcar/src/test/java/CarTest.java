import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    @DisplayName("자동차가 전진하면 위치가 1칸 증가해야한다.")
    void car_ShouldForward(){
        Car car = new Car("myCar1", 1);
        int carPosition = car.forward();

        assertThat(carPosition).isEqualTo(2);
    }
}
