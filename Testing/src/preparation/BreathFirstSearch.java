package preparation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class BreathFirstSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node A = new Node();
		A.data = 1;
		
		Node B = new Node();
		B.data = 2;
		
		
		Node C = new Node();
		C.data = 3;
		
		A.children.add(B);
		A.children.add(C);
		
		BFS(A);
	}
	
	
	public static void BFS(Node startNode){
		// Keep A queue of next children
		// Keep A set of visited nodes
		
		
		java.util.Queue<Node> queue = new java.util.LinkedList<Node>();
		java.util.Set<Node> numSet = new HashSet<Node>();
		
		if( startNode == null) return;
		
		queue.add(startNode);
		while( !queue.isEmpty()){
			
			Node currentNode = queue.poll();
			System.out.println(currentNode.data);
			List<Node> neighbors = currentNode.getChildren();
			
			for(Node elem: neighbors){
				
				if(!numSet.contains(elem))
				queue.add(elem);
			}
			
			numSet.add(currentNode);	
			
		}
		
	}
	
	static class Node{
		
		
		public ArrayList<Node> children = new ArrayList<Node>();
		int data;
		
		public Node() {
			// TODO Auto-generated constructor stub
		}

		public List<Node> getChildren() {
			// TODO Auto-generated method stub
			return children;
		}

		
	}

	
 
}




