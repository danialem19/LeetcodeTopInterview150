package LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = strs[0];
        int r = pre.length();
        for(int i = 1; i < strs.length; i++) {
            while (r > 0 && !strs[i].startsWith(pre.substring(0, r))) {
                r--;
            }
            if (r == 0) {
                return "";
            }
        }
        return pre.substring(0, r);
    }
}
