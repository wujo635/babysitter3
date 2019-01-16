package kata;

import static org.junit.Assert.assertEquals;

import kata.BabysitterCalculator;
import org.junit.Test;

public class BabysitterCalculatorTest {

    private BabysitterCalculator calculator = new BabysitterCalculator();

    @Test
    public void calculateReturnsNegativeOne() {
        assertEquals(-1, calculator.calculate());
}

}
