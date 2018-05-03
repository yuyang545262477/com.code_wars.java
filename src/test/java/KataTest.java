import kyu8.Kata;
import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {

    @Test
    public void digitize() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, Kata.digitize(35231));
    }
}