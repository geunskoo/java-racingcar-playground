import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CircuitTest {

    @Test
    @DisplayName("Circuit은 현재 가장 빠른 자동차들을 반환한다.")
    void cars_ShouldReportFastestCars(){
        Car carA = new Car("A", 0);
        Car carB = new Car("B", 1);
        Car carC = new Car("C", 1);

        Circuit circuit = new Circuit(Arrays.asList(carA, carB, carC));
        RacingReport racingReport = circuit.race();
        List<Car> fastestCars = racingReport.getFastestCars();

        assertThat(fastestCars).doesNotContain(carA);
        assertThat(fastestCars).contains(carB, carC);

    }
}
