package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyBabysitterCalculatorTest {

    private BabysitterCalculator calculator = new BabysitterCalculator();

    @Test
    public void shouldCalculatePayForFamilyA() {
        assertEquals(35, calculator.calculate(22,0,new FamilyA()));
    }
}
