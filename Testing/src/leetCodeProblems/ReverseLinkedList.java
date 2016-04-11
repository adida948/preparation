package leetCodeProblems;


public class ReverseLinkedList {
	//Reverse a LinkedList
	
/*	What is the reverse of null (the empty list)? null.
	What is the reverse of a one element list? the element.
	What is the reverse of an n element list? the reverse of the second element on followed by the first element.*/
	 
	public static  ListNode reverse(ListNode head)
	{
	    if (head == null) return null; // first question

	    if (head.next == null) return head; // second question

	    // third question - in Lisp this is easy, but we don't have cons
	    // so we grab the second element (which will be the last after we reverse it)

	    ListNode secondElem = head.next;

	    // bug fix - need to unlink list from the rest or you will get a cycle
	    head.next = null;

	    // then we reverse everything from the second element on
	    ListNode reverseRest = reverse(secondElem);

	    // then we join the two lists
	    secondElem.next = head;

	    return reverseRest;
	}
	
	
	public static void main(String[] args){
		
		ListNode head       = new ListNode(1);
		ListNode firstNode  = new ListNode(2);
		ListNode secondNode = new ListNode(3);
		ListNode thirdNode  = new ListNode(4);
		
		head.next = firstNode;
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		
		ListNode newHeadNode = reverse(head);
		
		while( newHeadNode != null)
		{
			System.out.print(newHeadNode.val + " ");
			newHeadNode = newHeadNode.next;
		}
	
	}
	
	public static class ListNode{
		int val; 
		ListNode next;
		ListNode(int x){val = x;}
	}
}
