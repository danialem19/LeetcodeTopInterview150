package JumpGame;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void canJump() {
        Solution solution = new Solution();
        int[] nums = {2,3,1,1,4};
        assertTrue(solution.canJump(nums));
    }

    @Test
    public void canJump_one() {
        Solution solution = new Solution();
        int[] nums = {3,2,1,0,4};
        assertFalse(solution.canJump(nums));
    }
}