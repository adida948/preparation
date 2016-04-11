package leetCodeProblems;

public class MaxDepthBinaryTree {

	/**
	 * @param args
	 * Given a binary tree, find its maximum depth.
	 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode rootNode = new TreeNode(1);
		TreeNode node1     = new TreeNode(1);
		TreeNode node2     = new TreeNode(2);
		TreeNode node3     = new TreeNode(3);
		TreeNode node4     = new TreeNode(4);
		TreeNode node5     = new TreeNode(5);
		TreeNode node6	   = new TreeNode(6);
		
		rootNode.left = node1;
		rootNode.right= node2;
		
		node1.left = node3;
		node3.right = node4;
		
		node4.left = node5;
		node5.left = node6;
		System.out.println(maxDepth(rootNode));
	}

	 public static int maxDepth(TreeNode root) {
	        
	        if( root == null)
	        return 0;
	        
	        if( root.left == null && root.right == null)
	        return 1;
	        
	        int  left  = 1 + maxDepth(root.left);
	        int  right = 1 + maxDepth(root.right);
	        
	        return  Math.max(left,right);
	    }
	 
	public static class TreeNode{
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x){ val = x;}
	}
}
