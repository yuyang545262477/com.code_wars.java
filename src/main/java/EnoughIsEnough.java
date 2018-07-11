import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class EnoughIsEnough {
    static int[] deleteNth(int[] elements, int maxOccurrences) {
        int[] copyElements = elements.clone();
        List<Integer> backElements = IntStream.of(copyElements).boxed().collect(Collectors.toList());
        //Code here ;)
        IntStream.of(elements)
                .distinct()
                .forEach((a) -> {
                    int index = 0;
                    Iterator<Integer> iterable = backElements.iterator();
                    while (iterable.hasNext()) {
                        int next = iterable.next();
                        if (next != a) continue;
                        index++;
                        if (index > maxOccurrences) iterable.remove();
                    }
                });
        return backElements.stream().mapToInt(i -> i).toArray();
    }

}
