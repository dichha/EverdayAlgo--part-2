//Definition of Binary Tree node
class TreeNode{
	int val;
	TreeNode left; 
	TreeNode right;

	TreeNode(int val){
		this.val = val; 
	}
}
public class CheckEqualityBinaryTree{
	public CheckEqualityBinaryTree(){};
	public boolean isSame(TreeNode a, TreeNode b){
		if(a == null && b == null)
			return true; 
		if(a == null || b == null)
			return false; 
		if(a.val == b.val)
			return isSame(a.left, b.left) && isSame(a.right, b.right);
		return false;
	}
	
}