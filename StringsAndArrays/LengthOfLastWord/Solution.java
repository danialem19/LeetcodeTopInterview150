package LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        int maxLen = Integer.MIN_VALUE;
        int curCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                curCount = 0;
                continue;
            }
            curCount++;
            maxLen = Math.max(maxLen, curCount);
        }
        return maxLen;
    }
}
