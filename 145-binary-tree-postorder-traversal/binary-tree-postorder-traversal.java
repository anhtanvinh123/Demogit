class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }

    private void dfs(TreeNode node, List<Integer> res) {
        if (node == null) return;

        dfs(node.left, res);   // Left
        dfs(node.right, res);  // Right
        res.add(node.val);     // Root
    }
}