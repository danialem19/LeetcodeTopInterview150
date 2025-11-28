package LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder();
        int maxLen = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                sb = new StringBuilder();
            }
            maxLen = Math.max(maxLen, sb.length());
        }
        return maxLen;
    }
}
