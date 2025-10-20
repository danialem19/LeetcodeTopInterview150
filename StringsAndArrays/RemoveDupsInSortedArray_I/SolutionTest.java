package RemoveDupsInSortedArray_I;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void removeDuplicates() {
        Solution solution = new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int ans = solution.removeDuplicates(nums);
        assertEquals(5, ans);
    }
}