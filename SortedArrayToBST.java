// Sorted Array to BST
class TreeNode{
	int val; 
	TreeNode left; 
	TreeNode right; 
	TreeNode(int val){
		this.val = val;
	}
}

public class SortedArrayToBST{
	public TreeNode sortedArrayToBST(int[] num){
		TreeNode node = helper(num, 0, num.length - 1);
		return node;
	} 
	public TreeNode helper(int[] num, low, high){
		if (low > high){
			return null;
		}
		int mid = (low + high)/2;
		TreeNode  node = new TreeNode(num[mid]);
		node.left = helper(num, 0, mid-1);
		node.righ; = helper(num, mid+1, high);
		return node;
	}
}