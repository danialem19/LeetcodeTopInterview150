package InsertDeleteGetRandom;

import java.util.*;

public class Solution {
    List<Integer> values;
    Map<Integer, Integer> locationValueMap;

    public Solution() {
        this.values = new ArrayList<>();
        this.locationValueMap = new HashMap<>();
    }

    public boolean insert(int val) {
        if (locationValueMap.containsKey(val)) return false;
        locationValueMap.put(val, values.size());
        values.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!locationValueMap.containsKey(val)) {
            return false;
        }
        int rInd = locationValueMap.get(val);

        int lastVal = values.getLast();
        values.set(rInd, lastVal);
        locationValueMap.put(lastVal, rInd);

        locationValueMap.remove(val);
        values.removeLast();
        return true;
    }

    public int getRandom() {
        Random r = new Random();
        int t = r.nextInt(values.size());
        return values.get(t);
    }
}
