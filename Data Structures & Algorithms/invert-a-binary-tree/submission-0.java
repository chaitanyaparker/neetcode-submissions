class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            TreeNode current = st.pop();

            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            if(current.left != null) st.push(current.left);
            if(current.right != null) st.push(current.right);
        }

        return root;
    }
}
