import org.junit.Test;

import static org.junit.Assert.*;

public class SquareDigitTest {

    @Test
    public void squareDigits() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
    }
}