class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }

    private void dfs(TreeNode node, List<Integer> res) {
        if (node == null) return;

        dfs(node.left, res);   // Left
        res.add(node.val);     // Root
        dfs(node.right, res);  // Right
    }
}