package kata;

import java.util.HashMap;
import java.util.Map;

public class FamilyA implements Family {
    @Override
    public Map<Integer, Integer> getHourPayMap() {
        HashMap<Integer,Integer> hourPayMap = new HashMap<>();
        hourPayMap.put(0, 20);
        hourPayMap.put(1, 20);
        hourPayMap.put(2, 20);
        hourPayMap.put(3, 20);
        hourPayMap.put(4, 20);
        hourPayMap.put(17, 15);
        hourPayMap.put(18, 15);
        hourPayMap.put(19, 15);
        hourPayMap.put(20, 15);
        hourPayMap.put(21, 15);
        hourPayMap.put(22, 15);
        hourPayMap.put(23, 20);
        return hourPayMap;
    }
}
