package finishedCode;

public class DeleteNodeLinkedList {
	
	LinkedListNode head;
	static LinkedListNode deleteNode; 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteNodeLinkedList list = new DeleteNodeLinkedList();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(8);
		list.addNode(5);
		list.addNode(1);
		list.print();
		list.deleteNode(deleteNode);
	}
	
	public void print(){
		LinkedListNode n = head;
		
		while(n != null){
			System.out.print(n.data + " ");
			if(n.data == 8)
			{
				deleteNode = n;
			}
			n = n.next;
		}
		System.out.println("****");
	}
	
	
	public void addNode(int d)
	{
		LinkedListNode n = new LinkedListNode(d);
		
		if(this.head == null)
		{
			this.head = n;
		}
		else{
			n.next = head;
			head = n;
		}
	}
	
	public void deleteNode (LinkedListNode node){
		
		node.data = node.next.data;
		node.next = node.next.next;
		
		printAfterDeleted(node);
	}
	
	public void printAfterDeleted(LinkedListNode newHead){
		LinkedListNode n = newHead;
		
		while(n != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println("****");
	}
	
	
	private class LinkedListNode{
		
		LinkedListNode next;
		int data;
		
		public LinkedListNode( int d){
			this.data = d;
		}
		
		
	}
	
	

}
