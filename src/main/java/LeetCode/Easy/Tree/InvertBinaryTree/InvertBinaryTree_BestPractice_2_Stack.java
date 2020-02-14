package LeetCode.Easy.Tree.InvertBinaryTree;

import LeetCode.Easy.Tree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * The above solution is correct, but it is also bound to the application stack, which means that it's no so much scalable
 * - (you can find the problem size that will overflow the stack and crash your application), so more robust solution would be to use stack data structure.
 */
public class InvertBinaryTree_BestPractice_2_Stack {
    public TreeNode solution(TreeNode root) {
        if (root == null) {
            return null;
        }

        final Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            final TreeNode node = stack.pop();
            final TreeNode left = node.left;
            node.left = node.right;
            node.right = left;

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return root;
    }
}