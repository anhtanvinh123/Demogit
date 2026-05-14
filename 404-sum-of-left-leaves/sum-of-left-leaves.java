class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }

    private int dfs(TreeNode node, boolean isLeft) {
        if (node == null) return 0;

        // nếu là leaf
        if (node.left == null && node.right == null) {
            return isLeft ? node.val : 0;
        }

        // tiếp tục xuống trái + phải
        return dfs(node.left, true) + dfs(node.right, false);
    }
}