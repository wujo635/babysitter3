package kata;

public class BabysitterCalculator {
    public int calculate(int start, int end) {
        if (isNotWithinWorkingHours(start) || isNotWithinWorkingHours(end) || isEndBeforeStartTime(start, end)) {
            return -1;
        }
        return (end - start);
    }

    private boolean isEndBeforeStartTime(int start, int end) {
        return end < start;
    }

    private boolean isNotWithinWorkingHours(int time) {
        return time < 17 && time > 4;
    }
}
