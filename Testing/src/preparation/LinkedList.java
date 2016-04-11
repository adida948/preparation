package preparation;

public class LinkedList {

	public static Node insertNodeinFront(Node head,Integer n){
		Node newNode = new Node(n);
		newNode.next = head;
		
		return newNode;
	}
	
	public static Node search(Node head, Integer data){
		
		while(head!=null && head.data != data){
			head = head.next;
		}
		return head;
	}
	
	public static Node insertInOrder(Node head, Node insert){
		
		if( head == null) return null;
		
		Node previous = head;
		Node current = head.next;
		
		//IF it is in the tail
		if(current == null){
			if(previous.data < insert.data){
			   previous.next = insert;
			   insert.next = null;
			   return head;
			}
			else{
				insert.next = previous;
				return insert;
			}
		}
		
		while(current !=null){
			
			if(previous.data < insert.data && current.data >= insert.data){
				previous.next = insert;
				insert.next = current;
				return head;
			}
			
			current = current.next;
			previous = previous.next;
		}
		
		current =insert;
		insert.next = null;
		
		return head;
	}
	
	public static Node remove(Node head,Integer data){
		if( head.data == data) return head.next;
		
		Node previous = null;
		Node current = head;
		
		while(current!= null){
			
			if(current.data == data){
				previous.next = current.next;
				return head;
			}
			else
			{
				previous = current;
				current = current.next;
			}
		}
		
		return head;
	}
	
	//Reverse Linked List
	public static Node reverse (Node head){
		
		Node previous = null;
		Node current = head;
		Node forward;
		
		while(current!=null){
			forward = current.next;
			current.next = previous;
			previous = current;
			current = forward;
		}
		
		return previous;
	}
	
	
	//Hascycle
	public static boolean hasCycle(Node head){
		
		Node fast = head;
		Node slow = head;
		
		while( fast != null && slow != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		
		
		
		Node head = new Node(3);
		head = insertNodeinFront(head, 2);
		head = insertNodeinFront(head, 1);
		System.out.println("Node is found with value " + search(head, 9));
		//head = reverse(head);
		//head = remove(head, 2);
		//head = insertInOrder(head, new Node(7));
		System.out.println("Has cycle? " + hasCycle(head));
		while(head!= null){
			
			System.out.print(head.data + " --> ");
			head = head.next;
		}
	}
}


class Node{
	Integer data;
	Node next;
	
	public Node(Integer data){ 
		
		this.data = data;
	}
}
