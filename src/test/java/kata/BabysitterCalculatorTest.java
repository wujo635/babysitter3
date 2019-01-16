package kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BabysitterCalculatorTest {

    private BabysitterCalculator calculator = new BabysitterCalculator();

    @Test
    public void calculatePayForOneHourOfWork() {
        assertEquals(1, calculator.calculate(17, 18));
    }

    @Test
    public void calculatePayForTwoHoursWork() {
        assertEquals(2,calculator.calculate(17,19));
    }
}
