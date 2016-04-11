package finishedCode;

// Is  a tree a binary search tree
// - Print all path which sums up to a given value running time N
    // Go left and right sum becomes bigger or smaller. 


public class isBinarySearchTree {
	
	final static int  min = Integer.MIN_VALUE;
	final static int  max = Integer.MAX_VALUE;
	
	public static class TreeNode{
		
		
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int data)
		{
			this.data = data;
		}
	
	}
	
	public static void main(String[] args){
		
	TreeNode rootNode  = new TreeNode(5);
	TreeNode node1     = new TreeNode(2);
	TreeNode node2     = new TreeNode(6);
	TreeNode node3     = new TreeNode(1);
	TreeNode node4     = new TreeNode(4);
	
	
	
	rootNode.left = node1;
	rootNode.right= node2;
	
	node1.left = node3;
	node1.right = node4;
	
	
	//Test if a Tree is a Binary Search Tree
	boolean isBinarySearch= isBST(rootNode,max,min);
	
	//Print all paths from the leaf
	printAllPathsToLeaf(rootNode,new int[20],0);
	
	System.out.println(isBinarySearch);
	
	}
	
	public static boolean isBST(TreeNode n, int max, int min){
		
		if(n == null)
			return true;
		
		if(   !(min <= n.data && n.data < max)){
			return false;
		}
		
		boolean isLeaf = isBST(n.left,n.data,min);
		boolean isRight = isBST(n.right,max,n.data);
		
		return isLeaf && isRight;
	}
	
	public static void printAllPathsToLeaf(TreeNode node,int[] path,int len)
	{
		
		if(node == null)
			return;
		
		//We store the data in the array
		path[len] = node.data;
		len++;
		if(node.left == null && node.right == null){
			//it is a leaf node
			printArray(path,len);
			return;
		}
		
		printAllPathsToLeaf(node.left, path, len);
		printAllPathsToLeaf(node.right, path, len);
		
		
	}
	
	public static void printArray(int[] path,int len){
		
		for (int i = 0; i < len; i++) {
			System.out.println(" " + path[i]);
		}
		System.out.println();
	}
}