package projects;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

//FIFO  FIRST IN, FIRST OUT   
public class Queue {

	LinkedList<Integer> queue;
	 

	//Making a  Queue instance
	public Queue(){
		queue = new LinkedList();
	}
	
	//Checking if queue is empty
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	
	//Return size
	public int size(){
		return queue.size();
	}
	
	//Enqueue an item
	public void enqueue(int n){
		this.queue.addLast(n);
	}
	
	//Dequeue an item
	public int dequeue(){
		return this.queue.remove(0);
	}
	
	//Peek a the first item
	
	public int peek(){
		return this.queue.get(0);
	}
	
	
	public static void main(String[] args){
		
		Queue numQueue = new Queue();
		
		numQueue.enqueue(1);
		numQueue.enqueue(2);
		numQueue.enqueue(3);
		numQueue.enqueue(4);
		
		System.out.println("First  Out: " + numQueue.dequeue());
		System.out.println("Peek at Second Item : " + numQueue.peek());
		System.out.println("Second Out: " + numQueue.dequeue());
		System.out.println("Third  Out: " + numQueue.dequeue());
		System.out.println("Fourth Out: " + numQueue.dequeue());

	}
	
	
	
}
