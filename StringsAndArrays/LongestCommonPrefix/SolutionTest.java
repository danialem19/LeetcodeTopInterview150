package LongestCommonPrefix;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void longestCommonPrefixOne() {
        Solution solution = new Solution();
        String[]  strs = new String[]{"flower","flow","flight"};
        assertEquals("fl", solution.longestCommonPrefix(strs));
    }

    @Test
    public void longestCommonPrefixTwo() {
        Solution solution = new Solution();
        String[]  strs = new String[]{"dog","racecar","car"};
        assertEquals("", solution.longestCommonPrefix(strs));
    }

}