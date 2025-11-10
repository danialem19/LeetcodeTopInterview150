package JumpGame_II;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void jump() {
        Solution solution = new Solution();
        int[] nums = {2,3,1,1,4};
        assertEquals(2, solution.jump(nums));
    }

    @Test
    public void jump_two() {
        Solution solution = new Solution();
        int[] nums = {2,3,0,1,4};
        assertEquals(2, solution.jump(nums));
    }
}