package ZigzagConversion;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void convertTestOne() {
        Solution solution = new Solution();
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
    }

    @Test
    public void convertTestTwo() {
        Solution solution = new Solution();
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
    }

    @Test
    public void convertTestThree() {
        Solution solution = new Solution();
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
    }
}