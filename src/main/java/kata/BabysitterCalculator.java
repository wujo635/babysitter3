package kata;

public class BabysitterCalculator {
    public int calculate(int start, int end) {
        if (start < 17 && start > 4) {
            return -1;
        }
        if (end < 17 && end > 4) {
            return -1;
        }
        return (end - start);
    }
}
