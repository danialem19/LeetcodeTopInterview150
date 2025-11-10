package JumpGame_II;

public class Solution {
    public int jump(int[] nums) {
        int jumps = 0, maxJump = 0, curMaxJump = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            curMaxJump = Math.max(curMaxJump, i + nums[i]);
            if (curMaxJump >= nums.length - 1) {
                return ++jumps;
            }
            if (maxJump < curMaxJump) {
                maxJump = curMaxJump;
                jumps++;
            }
        }
        return jumps;
    }
}
