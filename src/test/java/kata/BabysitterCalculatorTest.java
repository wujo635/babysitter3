package kata;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BabysitterCalculatorTest {

    private BabysitterCalculator calculator = new BabysitterCalculator();
    private Family family = () -> {
        HashMap<Integer, Integer> hourPayMap = new HashMap<>();
        hourPayMap.put(0, 1);
        hourPayMap.put(1, 1);
        hourPayMap.put(2, 1);
        hourPayMap.put(3, 1);
        hourPayMap.put(4, 1);
        hourPayMap.put(17, 1);
        hourPayMap.put(18, 1);
        hourPayMap.put(19, 1);
        hourPayMap.put(20, 1);
        hourPayMap.put(21, 1);
        hourPayMap.put(22, 1);
        hourPayMap.put(23, 1);
        return hourPayMap;
    };

    @Test
    public void shouldCalculatePayForOneHourOfWork() {
        assertEquals(1, calculator.calculate(17, 18, family));
    }

    @Test
    public void shouldCalculatePayForTwoHoursWork() {
        assertEquals(2, calculator.calculate(17, 19, family));
    }

    @Test
    public void shouldReturnZeroWhenStartEqualsEndTime() {
        assertEquals(0, calculator.calculate(17, 17, family));
    }

    @Test
    public void shouldDisallowStartTimeEarlierThan5pm() {
        assertEquals(-1, calculator.calculate(16, 18, family));
    }

    @Test
    public void shouldAllowTimesAsLateAs4am() {
        assertEquals(0, calculator.calculate(4, 4, family));
    }

    @Test
    public void shouldDisallowEndTimeAfter4am() {
        assertEquals(-1, calculator.calculate(4, 5, family));
    }

    @Test
    public void shouldDisallowEndTimeBefore4pm() {
        assertEquals(-1, calculator.calculate(4, 15, family));
    }

    @Test
    public void shouldDisallowEndBeforeStartTime() {
        assertEquals(-1, calculator.calculate(19, 17, family));
    }

    @Test
    public void shouldAllowEndAtMidnight() {
        assertEquals(1, calculator.calculate(23, 0, family));
    }

    @Test
    public void shouldAllowStartAtMidnight() {
        assertEquals(1, calculator.calculate(0, 1, family));
    }

    @Test
    public void shouldAllowTimesToCrossMidnight() {
        assertEquals(11, calculator.calculate(17, 4, family));
    }

    @Test
    public void shouldAllowVariablePayrate() {
        assertEquals(35, calculator.calculate(22,24, new FamilyA()));
    }
    
}

