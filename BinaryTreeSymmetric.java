import java.util.Queue;
import java.util.LinkedList; 

// TreeNode class definition
class TreeNode{
	int val; 
	TreeNode left; 
	TreeNode right; 
	TreeNode(int val){
		this.val = val; 
	}
} 
public class BinaryTreeSymmetric{
	BinaryTreeSymmetric(){};
	public boolean isSymmetric(TreeNode root){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root); 
		q.add(root); 
		while(!q.isEmpty()){
			TreeNode t1 = q.poll(); 
			TreeNode t2 = q.poll();
			if(t1 == null && t2 == null)
				continue; 
			if(t1 == null || t2 == null)
				return false; 
			if(t1.val != t2.val)
				return false;
			q.add(t1.left);
			q.add(t2.right);
			q.add(t1.right);
			q.add(t2.left);
		}
		return true; 
	}
}