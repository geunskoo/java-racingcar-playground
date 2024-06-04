import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CircuitTest {

    @Test
    @DisplayName("자동차 이름을 입력하면 서킷에 자동차들이 생성된다.")
    void inputCarNames_ShouldGenerateCircuitAndCars(){
        Circuit circuit = new Circuit("A,B,C");
        List<Car> cars = circuit.getCars();
        Car carA = cars.get(0);
        Car carB = cars.get(1);
        Car carC = cars.get(2);

        assertThat(carA.getName()).isEqualTo("A");
        assertThat(carB.getName()).isEqualTo("B");
        assertThat(carC.getName()).isEqualTo("C");
        assertThat(carA.getPosition()).isEqualTo(0);
        assertThat(carB.getPosition()).isEqualTo(0);
        assertThat(carC.getPosition()).isEqualTo(0);

    }

    @Test
    @DisplayName("Circuit은 현재 가장 빠른 자동차들을 반환한다.")
    void cars_ShouldReportFastestCars(){
        Car carA = new Car("A", 0);
        Car carB = new Car("B", 1);
        Car carC = new Car("C", 1);

        Circuit circuit = new Circuit(Arrays.asList(carA, carB, carC));
        RacingReport racingReport = circuit.race();
        List<String> names = racingReport.getFastestCarNames();

        assertThat(names).doesNotContain("A");
        assertThat(names).contains("B","C");

    }
}
