package kata;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class FamilyBTest {

    private Map<Integer, Integer> hourPayMap = new FamilyB().getHourPayMap();

    @Test
    public void shouldPay12PerHourBefore10pm() {
        assertEquals(Integer.valueOf(12), hourPayMap.get(17));
        assertEquals(Integer.valueOf(12), hourPayMap.get(18));
        assertEquals(Integer.valueOf(12), hourPayMap.get(19));
        assertEquals(Integer.valueOf(12), hourPayMap.get(20));
        assertEquals(Integer.valueOf(12), hourPayMap.get(21));
    }

    @Test
    public void shouldPay8PerHourBetween10pmAnd12am() {
        assertEquals(Integer.valueOf(8), hourPayMap.get(22));
        assertEquals(Integer.valueOf(8), hourPayMap.get(23));
    }
}
