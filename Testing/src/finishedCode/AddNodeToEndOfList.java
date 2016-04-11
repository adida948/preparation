package finishedCode;

import java.util.Scanner;

//Add Node to the end of the linkedList. Return list of all the nodes
public class AddNodeToEndOfList {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
          Node head=null;
          int T=sc.nextInt();
          while(T-->0){
              int ele=sc.nextInt();
              head=insert(head,ele);
          }
          display(head);
          
	}
	
	
	public static  Node insert(Node head,int data)
	{
		Node mainHead = head;
  	//Complete this method
        if( mainHead == null){
        	mainHead = new Node(data);
        }
        else {
             while(head.next != null)
            {
               head = head.next; 
            }
            head.next = new Node(data);
        } 
        return mainHead;           
	}
	
    public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
	
 public static class Node {
		
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	

}
