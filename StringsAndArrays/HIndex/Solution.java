package HIndex;

import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int i = citations.length;
        while (i > 0 && citations[citations.length - i] < i) {
            i--;
        }
        return i;
    }
}
