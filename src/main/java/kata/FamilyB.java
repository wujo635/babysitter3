package kata;

import java.util.HashMap;
import java.util.Map;

public class FamilyB implements Family {

    @Override
    public Map<Integer, Integer> getHourPayMap() {
        HashMap<Integer,Integer> hourPayMap = new HashMap<>();
//        hourPayMap.put(0, 16);
//        hourPayMap.put(1, 16);
//        hourPayMap.put(2, 16);
//        hourPayMap.put(3, 16);
        hourPayMap.put(17, 12);
        hourPayMap.put(18, 12);
        hourPayMap.put(19, 12);
        hourPayMap.put(20, 12);
        hourPayMap.put(21, 12);
        hourPayMap.put(22, 8);
        hourPayMap.put(23, 8);
        return hourPayMap;
    }

}
