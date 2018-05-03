public class Accumul {
    public static String accum(String s) {
        StringBuilder backString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String temp_Up = s.substring(i, i + 1).toUpperCase();
            String temp_low = i == 0 ? "" : renderTempLow(temp_Up, i);
            String center = i == s.length() - 1 ? "" : "-";
            backString.append(temp_Up).append(temp_low).append(center);
        }
        return backString.toString();
//        String[] a = s.toLowerCase().split("");
//        String res = "";
//        for (int i = 0; i < a.length; i++) {
//            res += a[i].toUpperCase();
//            for (int j = 1; j < i + 1; j++)
//                res += a[i];
//            res += "-";
//        }
//        return res.substring(0, res.length()-1);
        // your code
    }

    private static String renderTempLow(String temp_up, int i) {
        String low = temp_up.toLowerCase();
        StringBuilder backString = new StringBuilder();
        for (int j = 0; j < i; j++) {
            backString.append(low);
        }
        return backString.toString();
    }
}