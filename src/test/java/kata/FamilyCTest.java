package kata;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class FamilyCTest {

    private Map<Integer, Integer> hourPayMap = new FamilyC().getHourPayMap();

    @Test
    public void shouldPay21PerHourBefore9pm() {
        assertEquals(Integer.valueOf(21), hourPayMap.get(17));
    }
}
