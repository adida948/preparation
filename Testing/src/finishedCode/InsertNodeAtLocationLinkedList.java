package finishedCode;

class Node1{
	int data;
	Node1 next;
}

public class InsertNodeAtLocationLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node1 firstNode = new Node1();
		Node1 secondNode = new Node1();
		Node1 thirdNode = new Node1();
		
		firstNode.data = 1;
		firstNode.next = secondNode;
		
		secondNode.data = 4;
		secondNode.next = thirdNode;
		
		thirdNode.data = 5;
		thirdNode.next = null;
		
		Node1 headNode = InsertNth(firstNode, 4, 3);
		
		while(headNode !=null){
			System.out.print(headNode.data);
			headNode = headNode.next;
		}

	}
	
	
	static Node1 InsertNth(Node1 head, int data, int position) {
		   // This is a "method-only" submission. 
	    // You only need to complete this method. 
		   if(head == null){
			     Node1 addNode = new Node1();	
			     addNode.data = data;
			     addNode.next = null;
			     head = addNode;
			      return head;
			    }
			    
			    Node1 savedHead = head;
			    Node1 prev = null;

			    
			    int counterFromHead = 0;
			    while(head !=null){
			        
			        if(counterFromHead == position){
			          Node1 insertNode = new Node1();
			          insertNode.data = data;
			            if(position == 0){
			             insertNode.next = head;
			             head = insertNode;
			                return head;
			            }
			  
			            prev.next = insertNode;
			            insertNode.next = head;
			            
			            return savedHead;
			        
			        }
			        Node1 temphead = head;
			        head = head.next;
			        prev = temphead;
			        counterFromHead++;
			    }
		    
		        if(position >= counterFromHead){
		            Node1 newNode = new Node1();
		            newNode.next = null;
		            newNode.data = data;
		            prev.next = newNode;
		            
		        }
			    
			    return savedHead;
	}

}

