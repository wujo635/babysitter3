package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Map;

public class FamilyATest {

    private Map<Integer, Integer> hourPayMap = new FamilyA().getHourPayMap();

    @Test
    public void shouldPay15ForEachHourPriorTo11pm() {
        assertEquals(Integer.valueOf(15), hourPayMap.get(17));
    }
}
