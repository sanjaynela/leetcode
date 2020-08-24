public class Problem26Stack{
    public boolean isValidBST(TreeNode root) {
        //Approach : Inorder Traversal
        Stack<TreeNode> stack = new Stack<TreeNode>();
        double inorder = -Double.MAX_VALUE;

        while(!stack.isEmpty() || root!=null){
            //Push to stack
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            // If next element in inorder traversal
            // is smaller than the previous one
            // that's not BST.
            if(root.val<=inorder){
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }
}