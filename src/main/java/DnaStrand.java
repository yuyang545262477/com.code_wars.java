import java.util.Arrays;
import java.util.stream.Collectors;

class DnaStrand {
    static String makeComplement(String dna) {
        //Your code
        return Arrays.stream(dna.split(""))
                .map(s -> {
                    String backString;
                    switch (s) {
                        case "T":
                            backString = "A";
                            break;
                        case "A":
                            backString = "T";
                            break;
                        case "C":
                            backString = "G";
                            break;
                        case "G":
                            backString = "C";
                            break;
                        default:
                            backString = s;
                    }
                    return backString;
                }).collect(Collectors.joining());
    }
}
