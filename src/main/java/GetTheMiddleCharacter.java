public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        int length = word.length();
        //Code goes here!
        return length % 2 == 0 ? evenWord(word, length) : oddWord(word, length);
    }

    private static String oddWord(String word, int length) {
        return word.substring(length / 2, (length / 2) + 1);
    }

    private static String evenWord(String word, int length) {
        return word.substring((length / 2) - 1, length / 2 + 1);
    }

}
