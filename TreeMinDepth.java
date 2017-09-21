// The program returns the min depth of a bianary tree
// TreeNode class
class TreeNode{
	TreeNode left; 
	TreeNode right; 
	private int val; 
	TreeNode( val){
		this.val = val; 
	}
}


public class TreeMinDepth{
	TreeMinDepth(){}
	public int findMinDepth(TreeNode root){
		if (root == null)
			return 0; 

		int l = findMinDepth(root.left);
		int r = findMinDepth(root.right);

		return (l==0 || r == 0) ? l +r + 1 : Math.min(l, r) + 1;
	}


}