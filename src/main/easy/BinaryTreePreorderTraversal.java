package main.easy;

import utils.TreeNode;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        // preorder: root, left, right
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            if (curr != null) {
                list.add(curr.val);
                stack.push(curr.right);
                stack.push(curr.left);
            }
        }
        return list;
    }
}