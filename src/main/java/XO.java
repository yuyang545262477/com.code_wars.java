import java.util.stream.Stream;

public class XO {
    public static boolean getXO(String str) {
        long xStream = Stream.of(str.split("")).map(String::toLowerCase).
                filter(x -> x.equals("x"))
                .count();
        long yStream = Stream.of(str.split("")).map(String::toLowerCase).filter(x -> x.equals("o")).count();
        return xStream == yStream;
    }
}
