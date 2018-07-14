
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;
        return Stream.of(phrase.split(" "))
                .filter(Objects::nonNull)
                .map(str -> {
                    char startKey = str.charAt(0);
                    return str.replace(startKey, Character.toUpperCase(startKey));
                })
                .collect(Collectors.joining(" "));
    }
}
