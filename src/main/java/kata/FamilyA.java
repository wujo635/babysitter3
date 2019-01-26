package kata;

import java.util.HashMap;
import java.util.Map;

public class FamilyA implements Family {
    @Override
    public Map<Integer, Integer> getHourPayMap() {
        HashMap<Integer,Integer> hourPayMap = new HashMap<>();
        return hourPayMap;
    }
}
