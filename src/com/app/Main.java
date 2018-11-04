package com.app;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.TreeNode treeNode = new Solution.TreeNode(1);
        treeNode.left = new Solution.TreeNode(2);
        treeNode.right = new Solution.TreeNode(3);
        System.out.println(solution.findTilt(treeNode));
    }
}
