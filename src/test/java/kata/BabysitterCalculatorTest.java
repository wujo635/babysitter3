package kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BabysitterCalculatorTest {

    private BabysitterCalculator calculator = new BabysitterCalculator();

    @Test
    public void calculatePayForOneHourOfWork() {
        assertEquals(1, calculator.calculate(17,18));
}

}
