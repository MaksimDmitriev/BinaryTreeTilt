package com.app;

public class Solution {

    private int tilt;

    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        tilt = 0;
        sum(root);
        return tilt;
    }

    private int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        tilt += Math.abs(left - right);
        return root.val + left + right;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
