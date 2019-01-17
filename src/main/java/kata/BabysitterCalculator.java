package kata;

public class BabysitterCalculator {
    public int calculate(int start, int end) {
        if (isNotWithinWorkingHours(start) || isNotWithinWorkingHours(end)) {
            return -1;
        }
        return (end - start);
    }

    private boolean isNotWithinWorkingHours(int time) {
        return time < 17 && time > 4;
    }
}
