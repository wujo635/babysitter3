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
        assertEquals(2, calculator.calculate(17, 19));
    }

    @Test
    public void startTimeEqualEndTimeReturnsZero() {
        assertEquals(0, calculator.calculate(17, 17));
    }

    @Test
    public void startTimeCannotBeEarlierThan5pm() {
        assertEquals(-1, calculator.calculate(16, 18));
    }

    @Test
    public void startTimeCanBeLateAs4am() {
        assertEquals(0, calculator.calculate(4, 4));
    }

    @Test
    public void endTimeOutOfBoundsAt5am() {
        assertEquals(-1,calculator.calculate(4,5));
    }
}
