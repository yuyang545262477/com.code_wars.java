import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BasicOperationsTest {

    @Test
    public void basicMath() {
        System.out.println("Basic Tests");
        assertThat(basicOps.basicMath("+", 4, 7), is(11));
        assertThat(basicOps.basicMath("-", 15, 18), is(-3));
        assertThat(basicOps.basicMath("*", 5, 5), is(25));
        assertThat(basicOps.basicMath("/", 49, 7), is(7));
    }

    @Test
    public void basicMath1() {
    }
}