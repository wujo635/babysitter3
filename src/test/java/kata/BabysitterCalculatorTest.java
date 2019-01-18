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
    public void startTimeCannotBeEarlierThan5pmReturnsNegative1() {
        assertEquals(-1, calculator.calculate(16, 18));
    }

    @Test
    public void startTimeCanBeLateAs4am() {
        assertEquals(0, calculator.calculate(4, 4));
    }

    @Test
    public void endTimeOutOfBoundsAt5amReturnsNegative1() {
        assertEquals(-1, calculator.calculate(4, 5));
    }

    @Test
    public void endTimeOutOfBoundsAt3pmReturnsNegative1() {
        assertEquals(-1, calculator.calculate(4, 15));
    }

    @Test
    public void endOneHourBeforeStartReturnsNegative1() {
        assertEquals(-1, calculator.calculate(18, 17));
    }

    @Test
    public void endTwoHoursBeforeStartReturnsNegative1() {
        assertEquals(-1, calculator.calculate(19, 17));
    }
}

