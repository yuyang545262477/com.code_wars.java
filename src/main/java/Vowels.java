
public class Vowels {
    public static int getCount(String str) {
        return (int) str.chars().filter(s -> "aeiou".indexOf(s) != -1).count();
    }
}
