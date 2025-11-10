package HIndex;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void hIndex_test() {
        Solution solution = new Solution();
        assertEquals(3, solution.hIndex(new int[]{3, 0, 6, 1, 5}));
    }

    @Test
    public void hIndex_test_1() {
        Solution solution = new Solution();
        assertEquals(0, solution.hIndex(new int[]{0}));
    }

    @Test
    public void hIndex_test_2() {
        Solution solution = new Solution();
        assertEquals(1, solution.hIndex(new int[]{1}));
    }

}