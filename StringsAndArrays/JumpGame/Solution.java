package JumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
        int nextPos = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            if(i + nums[i] >= nextPos) {
                nextPos = i;
            }
        }
        return nextPos == 0;
    }
}
