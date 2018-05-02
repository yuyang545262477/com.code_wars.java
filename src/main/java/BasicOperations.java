
import java.util.Arrays;

class basicOps {
    public static Integer basicMath(String op, int v1, int v2) {
        String[] operator = {"+", "-", "*", "/"};
        int index = Arrays.asList(operator).indexOf(op);
        switch (index) {
            case 0:
                return v1 + v2;
            case 1:
                return v1 - v2;
            case 2:
                return v1 * v2;
            case 3:
                return v1 / v2;
        }
        return 0;
    }
}
