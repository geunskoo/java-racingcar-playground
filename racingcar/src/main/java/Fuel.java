public class Fuel {

    private static final int GOOD_FUEL_STD = 4;

    private int status;

    public Fuel(int status) {
        fuelValidation(status);
        this.status = status;
    }

    public boolean isAbleToUse() {
        return this.status >= GOOD_FUEL_STD;
    }

    private static void fuelValidation(int status) {
        if (status > 9 || status < 0){
            throw new IllegalArgumentException("기름은 0과 9사이의 숫자만 입력이 가능합니다.");
        }
    }
}
