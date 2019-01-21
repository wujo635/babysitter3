package kata;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class BabysitterCalculatorTest {

    private BabysitterCalculator calculator = new BabysitterCalculator();

    @Test
    public void shouldCalculatePayForOneHourOfWork() {
        assertEquals(1, calculator.calculate(17, 18));
    }

    @Test
    public void shouldCalculatePayForTwoHoursWork() {
        assertEquals(2, calculator.calculate(17, 19));
    }

    @Test
    public void shouldReturnZeroWhenStartEqualsEndTime() {
        assertEquals(0, calculator.calculate(17, 17));
    }

    @Test
    public void shouldDisallowStartTimeEarlierThan5pm() {
        assertEquals(-1, calculator.calculate(16, 18));
    }

    @Test
    public void shouldAllowTimesAsLateAs4am() {
        assertEquals(0, calculator.calculate(4, 4));
    }

    @Test
    public void shouldDisallowEndTimeAfter4am() {
        assertEquals(-1, calculator.calculate(4, 5));
    }

    @Test
    public void shouldDisallowEndTimeBefore4pm() {
        assertEquals(-1, calculator.calculate(4, 15));
    }

    @Test
    public void shouldDisallowEndBeforeStartTime() {
        assertEquals(-1, calculator.calculate(19, 17));
    }

    @Test
    public void shouldAllowEndAtMidnight() {
        assertEquals(1, calculator.calculate(23, 0));
    }

    @Test
    public void shouldAllowStartAtMidnight() {
        assertEquals(1, calculator.calculate(0,1));
    }
}

