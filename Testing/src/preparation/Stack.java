package preparation;

import java.util.EmptyStackException;

//Stack implementation using a linkedlist-like sturcture 
public class Stack<T> {

    StackNode top;

    public int pop(){
    	if(top==null) throw new EmptyStackException();
    	int item  = top.data;
    	top = top.next;
    	return item;
    }
    
    public void push(int item){
    	StackNode t = new StackNode(item);
    	t.next = top;
    	top = t;
    }
    
    public int peek(){
    	if(top == null) throw new EmptyStackException();
    	return top.data;
    }
    
    public boolean isEmpty(){
    	return top == null;
    }
    
    public static void main(String[] args){
    	
    	Stack<Integer> myStack = new Stack<Integer>();
    	myStack.push(1);
    	myStack.push(2);
    	
    	while(!myStack.isEmpty()){
    		System.out.println(myStack.pop());
    		
    	}
    	try{
    	System.out.println(myStack.peek());
    	}
    	catch( EmptyStackException e){
    		System.out.println(e);
    	}
    }
}

class StackNode{
	  int data;
      StackNode next;
	  StackNode(int  data){
    	this.data = data;
      }
}
      
      
