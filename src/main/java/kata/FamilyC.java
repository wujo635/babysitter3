package kata;

import java.util.HashMap;
import java.util.Map;

public class FamilyC implements Family {
    @Override
    public Map<Integer, Integer> getHourPayMap() {
        HashMap<Integer,Integer> hourPayMap = new HashMap<>();
//        hourPayMap.put(0, 15);
//        hourPayMap.put(1, 15);
//        hourPayMap.put(2, 15);
//        hourPayMap.put(3, 15);
        hourPayMap.put(17, 21);
        hourPayMap.put(18, 21);
        hourPayMap.put(19, 21);
        hourPayMap.put(20, 21);
        hourPayMap.put(21, 15);
//        hourPayMap.put(22, 15);
//        hourPayMap.put(23, 15);
        return hourPayMap;
    }
}
