package IntegerToRoman;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void intToRomanOne() {
        Solution solution = new Solution();
        assertEquals("MMMDCCXLIX", solution.intToRoman(3749));
    }

    @Test
    public void intToRomanTwo() {
        Solution solution = new Solution();
        assertEquals("LVIII", solution.intToRoman(58));
    }

    @Test
    public void intToRomanThree() {
        Solution solution = new Solution();
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }

}