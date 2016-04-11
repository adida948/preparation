package leetCodeProblems;

/*Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.*/



public class DeleteDuplicatesInLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode firstNode = new ListNode(2);
		ListNode secondNode = new ListNode(2);
		ListNode thirdNode = new ListNode(2);
		ListNode fourthNode = new ListNode(2);
		
		firstNode.next =secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = fourthNode;
		
		ListNode uniqueList = deleteDuplicates(firstNode);
		while (uniqueList != null) {
			System.out.println("--" +uniqueList.val);
			uniqueList = uniqueList.next;
			
		}

	}
	
	public static ListNode deleteDuplicates(ListNode head){
		if(head == null)
		{
			return head;
		}
		ListNode newList = head;
		
		while( head != null){		
			System.out.println(head.val);
			if(head.next!=null && head.val == head.next.val){
				head.next = head.next.next;
			}else
			head = head.next;
		}	
		return newList;		
	}
	
	public static class ListNode{
		int val; 
		ListNode next;
		ListNode(int x){val = x;}
	}
	
	

}
