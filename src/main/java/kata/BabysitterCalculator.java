package kata;

public class BabysitterCalculator {
    public int calculate(int start, int end) {
        if (start < 17) {
            return -1;
        }
        return (end - start);
    }
}
