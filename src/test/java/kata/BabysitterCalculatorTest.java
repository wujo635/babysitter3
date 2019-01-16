package kata;

import static org.junit.Assert.assertEquals;

import kata.BabysitterCalculator;
import org.junit.Test;

public class BabysitterCalculatorTest {

    @Test
    public void calculateReturnsNegativeOne() {
        assertEquals(-1,new BabysitterCalculator().calculate());
}

}
