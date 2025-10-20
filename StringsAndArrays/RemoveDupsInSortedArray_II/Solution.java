package RemoveDupsInSortedArray_II;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0, r = 0, dup = 1;
        while(r < nums.length) {
            if(nums[l] != nums[r]) {
                nums[++l] = nums[r];
                dup = 1;
            } else if (dup == 1) {
                nums[++l] = nums[r];
                dup++;
            }
            r++;
        }
        return ++l;
    }
}
