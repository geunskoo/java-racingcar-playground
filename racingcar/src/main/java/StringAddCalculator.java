import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static int splitAndSum(String s) {
        if (s == null || s.isEmpty()){
            return 0;
        }
        if (s.length() == 1){
            String[] tokens = {s};
            return StringSum(tokens);
        }
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(s);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] tokens= m.group(2).split(customDelimiter);
            return StringSum(tokens);
        }
        return StringSum(s.split(",|:"));
    }

    private static Integer StringSum(String[] tokens) {
        checkNegativeElement(tokens);
        return Arrays.stream(tokens)
                .map(Integer::parseInt)
                .reduce(Integer::sum)
                .get();
    }

    private static void checkNegativeElement(String[] tokens) {
        Arrays.stream(tokens)
                .map(Integer::parseInt)
                .filter(i -> i < 0)
                .findFirst()
                .ifPresent(i -> {
                    throw new RuntimeException("Negative number found: " + i);
                });
    }
}
