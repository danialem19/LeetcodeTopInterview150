package FindTheIndexOfTheFirstOccurrenceInAString;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void strStrTestOne() {
        Solution solution = new Solution();
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
    }

    @Test
    public void strStrTestTwo() {
        Solution solution = new Solution();
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
    }
}