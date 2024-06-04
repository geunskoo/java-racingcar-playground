import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringAddCalculatorTest {

    @Test
    @DisplayName("빈 문자열과 NULL 값은 0이 되어야 한다.")
    void nullAnd빈문자_ShouldCalculate0(){
        int result = StringAddCalculator.splitAndSum(null);
        assertThat(result).isEqualTo(0);

        result = StringAddCalculator.splitAndSum("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("입력 값 하나는 그대로 출력된다.")
     void oneValue_ShouldJustOutOneValue(){
        int result = StringAddCalculator.splitAndSum("1");
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName(" ',' 구분자로 분리된 숫자 간의 합계가 나와야한다.")
    void comma_ShouldSplitNumberAndCalculateCorrect(){
        int result = StringAddCalculator.splitAndSum("1,2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName(" ',' 또는 ':' 구분자로 분리된 숫자 간의 합계가 나와야한다.")
    void commaAndColon_ShouldSplitNumberAndCalculateCorrect(){
        int result = StringAddCalculator.splitAndSum("1,2:3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    @DisplayName("custom 구분자로 분리된 숫자 간의 합계가 나와야한다.")
    void custom_ShouldSplitNumberAndCalculateCorrect(){
        int result = StringAddCalculator.splitAndSum("//;\n1;2;3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    @DisplayName("음수가 있으면 RuntimeException 예외가 발생 해야한다.")
    void negative_ShouldOccurRuntimeException(){
        assertThatThrownBy(() -> StringAddCalculator.splitAndSum("-1,2,3"))
                .isInstanceOf(RuntimeException.class);

    }
}
