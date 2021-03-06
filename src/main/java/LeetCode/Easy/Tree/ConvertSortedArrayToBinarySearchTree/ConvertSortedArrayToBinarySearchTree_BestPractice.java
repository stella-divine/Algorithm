package LeetCode.Easy.Tree.ConvertSortedArrayToBinarySearchTree;

import LeetCode.Easy.Tree.TreeNode;

/**
 * 공식키워드 - Tree, Depth First Search
 */
public class ConvertSortedArrayToBinarySearchTree_BestPractice {
    public TreeNode solution(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        TreeNode head = helper(nums, 0, nums.length - 1);
        return head;
    }

    private TreeNode helper(int[] num, int low, int high) {
        if (low > high) { // Done
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, low, mid - 1);
        node.right = helper(num, mid + 1, high);
        return node;
    }
}