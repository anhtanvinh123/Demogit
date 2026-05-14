class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root, "", res);
        return res;
    }

    private void dfs(TreeNode node, String path, List<String> res) {
        if (node == null) return;

        // build path
        if (path.isEmpty()) {
            path = "" + node.val;
        } else {
            path = path + "->" + node.val;
        }

        // leaf node
        if (node.left == null && node.right == null) {
            res.add(path);
            return;
        }

        dfs(node.left, path, res);
        dfs(node.right, path, res);
    }
}