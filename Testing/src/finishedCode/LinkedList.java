package finishedCode;
import java.util.Arrays;
import java.util.HashMap;

public class LinkedList{
	LinkedListNode head;
	static int danilo = 99;
	
	
	public static  String isStatic(){
		
		return "wassup";
	}

	public static void  main(String[] args){

		LinkedList list = new LinkedList();
		list.addNode(1);
		list.addNode(3);
		list.addNode(5);
		list.addNode(1);
		list.print();
		list.deleteDup(list.head);
		System.out.println();
		list.print();
		
		String[] test1 = new String[5];
		Arrays.fill(test1, "1");
		int a  = LinkedList.danilo;
		
        String b = LinkedList.isStatic();
	}

	public void print(){

		LinkedListNode n= head;

		while(n!=null){
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public void deleteDup(LinkedListNode n){
		LinkedListNode prev = null;
		HashMap<Integer, Boolean> map = new HashMap<Integer,Boolean>();

		while(n !=null){
			if( map.containsKey(new Integer(n.data))){
				prev.next = n.next;
			}
			else{
				map.put(new Integer(n.data),true);
				prev = n;
			}
			n = n.next;			
		}
	}

	public void addNode(int d){
		LinkedListNode n = new LinkedListNode(d);

		if(this.head == null){
			this.head = n;
		}else{
			n.next = head;
			head = n;
		}
	}

	private class LinkedListNode{
		LinkedListNode next;
		int data;

		public LinkedListNode(int d){
			this.data=d;
		}
	}
}