package LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        int maxLen = 0;
        int i = s.length() - 1;
        while(i >= 0) {
            if (s.charAt(i) != ' ') {
                maxLen++;
            } else if (maxLen > 0) {
                return maxLen;
            }
            i--;
        }
        return maxLen;
    }
}
