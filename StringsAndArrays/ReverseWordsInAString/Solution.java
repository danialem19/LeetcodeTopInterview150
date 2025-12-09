package ReverseWordsInAString;

public class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int l = s.length() - 1, r = s.length() - 1;

        while(l >= 0) {
            while(l >= 0 && s.charAt(l) == ' ') {
                r = --l;
            }
            while(l >= 0 && s.charAt(l) != ' ') {
                --l;
            }
            sb.append(s, l+1, r+1).append(" ");
        }
        return sb.toString().trim();
    }
}
