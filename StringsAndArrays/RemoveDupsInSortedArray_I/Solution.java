package RemoveDupsInSortedArray_I;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0, r = 0;
        while(r < nums.length) {
            if(nums[l] != nums[r]) {
                nums[++l] = nums[r];
            }
            r++;
        }
        return ++l;
    }
}
