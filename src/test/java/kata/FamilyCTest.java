package kata;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class FamilyCTest {

    private Map<Integer, Integer> hourPayMap = new FamilyC().getHourPayMap();

    @Test
    public void shouldPay21PerHourBefore9pm() {
        assertEquals(Integer.valueOf(21), hourPayMap.get(17));
        assertEquals(Integer.valueOf(21), hourPayMap.get(18));
        assertEquals(Integer.valueOf(21), hourPayMap.get(19));
        assertEquals(Integer.valueOf(21), hourPayMap.get(20));
    }

    @Test
    public void shouldPay15PerHourAfter9pm() {
        assertEquals(Integer.valueOf(15), hourPayMap.get(21));
        assertEquals(Integer.valueOf(15), hourPayMap.get(22));
        assertEquals(Integer.valueOf(15), hourPayMap.get(23));
        assertEquals(Integer.valueOf(15), hourPayMap.get(0));
        assertEquals(Integer.valueOf(15), hourPayMap.get(1));
        assertEquals(Integer.valueOf(15), hourPayMap.get(2));
        assertEquals(Integer.valueOf(15), hourPayMap.get(3));
    }
}
