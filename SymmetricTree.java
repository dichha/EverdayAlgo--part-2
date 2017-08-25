//TreeNode definition 
class TreeNode{
	int val; 
	TreeNode left; 
	TreeNode right; 
	TreeNode(int val){
		this.val = val;
	}
}
public class SymmetricTree{
	SymmetricTree(){};
	public boolean isSymmetric(TreeNode root){
		return root == null || isSymmetricHelp(root.left, root.right);
	}
	private boolean isSymmetricHelp(TreeNode left, TreeNode right){
		if(left == null || right == null)
			return left == null;
		if(left.val != right.val)
			return false; 
		return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
	}

}