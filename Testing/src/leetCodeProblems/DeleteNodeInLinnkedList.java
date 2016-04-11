package leetCodeProblems;

public class DeleteNodeInLinnkedList {
	
	/*Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
	Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list
	should become 1 -> 2 -> 4 after calling your function.
	*/

	public static void main(String[] agrs){
		
		ListNode first  = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third  = new ListNode(3);
		ListNode fourth = new ListNode(4);
		
		first.next= second;
		second.next = third;
		third.next = fourth;
		fourth.next = null;
		
	
		deleteNode(third);
	}
	
	public static  void deleteNode(ListNode node){
		
	node.val = node.next.val;
	node.next = node.next.next;
		
	}
	
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
}
