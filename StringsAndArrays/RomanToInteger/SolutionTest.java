package RomanToInteger;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void romanToIntOne() {
        Solution solution = new Solution();
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    public void romanToIntTwo() {
        Solution solution = new Solution();
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    public void romanToIntThree() {
        Solution solution = new Solution();
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }

}