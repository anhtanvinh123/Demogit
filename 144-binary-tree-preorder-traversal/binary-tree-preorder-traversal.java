class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }

    private void dfs(TreeNode node, List<Integer> res) {
        if (node == null) return;

        res.add(node.val);      // Root
        dfs(node.left, res);    // Left
        dfs(node.right, res);   // Right
    }
}