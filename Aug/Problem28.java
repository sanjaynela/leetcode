public class Problem28{
    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root){
        if(root==null){
            return levels;
        }
        helper(root,0);
        return levels;
    }

    public void helper(TreeNode node,int level){
        //Start the current level
        if(level.size()==level){
            levels.add(new ArrayList<Integer>());
        }

        //Fulfil the current level
        levels.get(level).add(node.val);

        //Process child nodes for next level
        if(node.right!=null){
            helper(node.right,level+1);
        }
        if(node.left!=null){
            helper(node.left,level+1);
        }
    }
}