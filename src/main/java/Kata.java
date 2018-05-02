
public class Kata {
    public static int[] digitize(long n) {
//        todo 1: long convert to string;
        String temStr = Long.toString(n);
//        todo 2:string convert to array;
        int[] temArray = new int[temStr.length()];
        for (int i = 0; i < temStr.length(); i++) {
            temArray[i] = Integer.parseInt(String.valueOf(temStr.charAt(i)));
        }
//        todo 3:array reversed
        for (int i = 0, j = temArray.length - 1; i < j; i++, j--) {
            int temInt = temArray[i];
            temArray[i] = temArray[j];
            temArray[j] = temInt;
        }
//        todo 4: return array;
        return temArray;
    }
}
