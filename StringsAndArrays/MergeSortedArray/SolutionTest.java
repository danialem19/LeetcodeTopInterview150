package MergeSortedArray;


import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void testMergeSortedArray() {
        Solution solution = new Solution();
        int[] nums1 = {1,2,3,0,0,0} ;
        int[] nums2 = {2,5,6};
        solution.mergeSortedArray(nums1, 3, nums2, 3);
        assertEquals(6, nums1[5]);
        assertEquals(5, nums1[4]);
        assertEquals(3, nums1[3]);
        assertEquals(2, nums1[2]);
        assertEquals(2, nums1[1]);
        assertEquals(1, nums1[0]);
    }
}