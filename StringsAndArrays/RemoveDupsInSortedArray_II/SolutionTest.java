package RemoveDupsInSortedArray_II;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void removeDuplicates_test1() {
        Solution solution = new Solution();
        int[] nums = {1,1,1,2,2,3};
        int ans = solution.removeDuplicates(nums);
        assertEquals(5, ans);
    }

    @Test
    public void removeDuplicates_test2() {
        Solution solution = new Solution();
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int ans = solution.removeDuplicates(nums);
        assertEquals(7, ans);
    }
}