package IntegerToRoman;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> values = new HashMap<>();
        values.put(1, "I");
        values.put(4, "IV");
        values.put(5, "V");
        values.put(9, "IX");
        values.put(10, "X");
        values.put(40, "XL");
        values.put(50, "L");
        values.put(90, "XC");
        values.put(100, "C");
        values.put(400, "CD");
        values.put(500, "D");
        values.put(900, "CM");
        values.put(1000, "M");

        int place = 0;
        StringBuilder result  = new StringBuilder();

        while (num > 0) {
            int val = num % 10;
            int pow = (int)Math.pow(10, place);
            while (!values.containsKey(val * pow) && val > 0) {
                result.insert(0, values.get(pow));
                --val;
            }

            if (val > 0) {
                result.insert(0, values.get(val * pow));
            }

            num = num / 10;
            place++;
        }
        return result.toString();
    }
}
