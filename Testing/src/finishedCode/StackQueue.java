package finishedCode;

import java.util.Queue;
import java.util.Stack;

//*** YOU CAN't TRAVERSE A QUEUE OR STACK WITHOUTH REMOVING THINGS
/*palindrome is a "word, phrase, number, or other sequence of characters which reads the same backwards and forwards." 
 * Can you determine if a given string, s, is a palindrome?
 * To solve this challenge, we must first take each character in s, enqueue it in a queue, and also push 
 * it onto a stack. Once that's done, we must dequeue the first character from the queue and pop the top
 * character off the stack, then compare the two characters to see if they are the same; as long as the 
 * characters match, we continue dequeueing, popping, and comparing each character until our containers
 * are empty (a non-match means s isn't a palindrome).
 * Write the following four functions/methods in class Palindrome:

		void pushCharacter(char ch): Pushes a character onto a stack.
		void enqueueCharacter(char ch): Enqueues a character in a queue.
		char popCharacter(): Pops and returns the top character.
		char dequeueCharacter(): Dequeues and returns the first character.
*/
public class StackQueue {
	
	
	public static void main(String[] args) {
       
		String s = "racecar";
        
        // create the Palindrome class object p.
        Palindrome p = new Palindrome();
      
        char arr[]=s.toCharArray();//Converting string to a character array
        // push all the characters of string s to stack.
        for (char c : arr) {
            p.pushCharacter(c);
        }
        
        // enqueue all the characters of string s to queue.
        for (char c : arr) {
            p.enqueueCharacter(c);
        }
        
        boolean f = true;
        
        // pop the top character from stack.
        // dequeue the first character from queue.
        // compare both the characters.
        for (int i = 0; i < s.length(); i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                f = false;                
                break;
            }
        }
        
        // finally print whether string s is palindrome or not.
        if (f) {
            System.out.println("The word, "+s+", is a palindrome.");
        } else {
            System.out.println("The word, "+s+", is not a palindrome.");
        }
    }
}

class Palindrome{

	  private Stack<Character> numStack;
	  private Queue<Character> numQueue;
	  
	  public Palindrome(){
	   numStack =  new Stack<Character>();
	   numQueue =  new java.util.LinkedList<Character>();  
	  }
	public void pushCharacter(char c) {
		// TODO Auto-generated method stub
		numStack.push(c);
	}

	public void enqueueCharacter(char c) {
		// TODO Auto-generated method stub
		numQueue.add(c);
	}

	public char popCharacter() {
		// TODO Auto-generated method stub
		return numStack.pop();
	}

	public char dequeueCharacter() {
		// TODO Auto-generated method stub
		return numQueue.poll();
	}
	
}
