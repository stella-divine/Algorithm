package LeetCode.Easy.Array.MergeSortedArray;

/**
 * 공식키워드 - Array, Two Pointers
 */
public class MergeSortedArray_BestPractice {
    public void solution(int[] nums1, int m, int[] nums2, int n) {
        while (n > 0) {
            nums1[m + n - 1]
                    = (m == 0 || nums2[n - 1] > nums1[m - 1])
                    ? nums2[--n]
                    : nums1[--m];
        }
    }
}