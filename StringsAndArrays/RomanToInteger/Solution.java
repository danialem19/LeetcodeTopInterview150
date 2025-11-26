package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> vals = new HashMap<>();
        vals.put('I', 1);
        vals.put('V', 5);
        vals.put('X', 10);
        vals.put('L', 50);
        vals.put('C', 100);
        vals.put('D', 500);
        vals.put('M', 1000);

        int pre = 0, val = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                pre = vals.get(s.charAt(i));
                continue;
            }

            if (pre < vals.get(s.charAt(i))) {
                val -= pre;
            }
            if (pre >= vals.get(s.charAt(i))) {
                val += pre;
            }

            pre = vals.get(s.charAt(i));
        }
        return val + pre;
    }
}
