//TreeNode class definition 
class TreeNode{
	int val; 
	TreeNode left; 
	TreeNode right; 
	TreeNode(int val){
		this.val = val; 
	}
}
public class MaxDepth{
	MaxDepth(){};
	public int maxDepth(TreeNode root){
		if (root == null)
			return 0; 
		return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
	}
}