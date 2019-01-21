package kata;

import java.util.HashMap;
import java.util.Map;

public class BabysitterCalculator {
    public int calculate(int start, int end) {
        if (isInvalidWorkingHours(start, end)) {
            return -1;
        }
        return sumPay(start, end);
    }

    private int sumPay(int start, int end) {
        Map<Integer, Integer> hourPayMap = createHourPayMap();
        if (isAcrossMidnight(start, end)) {
            return sumPartialPay(start, 24, hourPayMap) + sumPartialPay(0, end, hourPayMap);
        }
        return sumPartialPay(start, end, hourPayMap);
    }

    private boolean isAcrossMidnight(int start, int end) {
        return (start >= 17) && (end >= 0 && end <= 4);
    }

    private int sumPartialPay(int start, int end, Map<Integer, Integer> hourPayMap) {
        int pay = 0;
        for (int i = start; i < end; i++) {
            pay += hourPayMap.get(i);
        }
        return pay;
    }

    private Map<Integer, Integer> createHourPayMap() {
        HashMap<Integer, Integer> hourPayMap = new HashMap<>();
        hourPayMap.put(0, 1);
        hourPayMap.put(1, 1);
        hourPayMap.put(2, 1);
        hourPayMap.put(3, 1);
        hourPayMap.put(4, 1);
        hourPayMap.put(17, 1);
        hourPayMap.put(18, 1);
        hourPayMap.put(19, 1);
        hourPayMap.put(20, 1);
        hourPayMap.put(21, 1);
        hourPayMap.put(22, 1);
        hourPayMap.put(23, 1);
        return hourPayMap;
    }

    private boolean isInvalidWorkingHours(int start, int end) {
        return isNotWithinWorkingHours(start) || isNotWithinWorkingHours(end) || isEndBeforeStartTime(start, end);
    }

    private boolean isEndBeforeStartTime(int start, int end) {
        start = adjustTimesAfterMidnight(start);
        end = adjustTimesAfterMidnight(end);
        return end < start;
    }

    private int adjustTimesAfterMidnight(int time) {
        if (time <= 4 && time >= 0) {
            time += 24;
        }
        return time;
    }

    private boolean isNotWithinWorkingHours(int time) {
        return time < 17 && time > 4;
    }
}
