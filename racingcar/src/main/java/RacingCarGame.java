
import java.util.Scanner;

public class RacingCarGame {

    private final Scanner scanner;
    private final Player player;

    public RacingCarGame(){
        this.scanner = new Scanner(System.in);
        this.player = new Player(scanner);
    }

    public RacingReport play() {
        String carNames = player.requestCarNames();
        int raceCycle = player.requestRaceCycle();
        Circuit circuit = new Circuit(carNames);

        RacingReport racingReport = new RacingReport();
        for (int i = 0; i < raceCycle; i++) {
            racingReport = circuit.race();
            racingReport.printCurrentCars();
        }
        racingReport.printFastestCarNames();

        return racingReport;
    }
}
