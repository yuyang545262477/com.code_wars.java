import java.util.Arrays;

public class HighestAndLowest {
    public static String HighAndLow(String numbers) {
        String[] numberArray = numbers.trim().split(" ");
        int max = Arrays.stream(numberArray)
                .mapToInt(Integer::parseInt)
                .max()
                .getAsInt();
        int min = Arrays.stream(numberArray)
                .mapToInt(Integer::parseInt)
                .min()
                .getAsInt();
        return String.format("%d %d", max, min);

    }
}
