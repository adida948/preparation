package projects;

import java.util.HashMap;
import java.util.Arrays;

public class ZerosMove {
	static String a;
	
	static {
		a = "sadsa";
	}
	public static void main(String[]args)
	{
		
		goodPerformance();
		System.out.println(a.equals("abc"));
	}
	
	
	public static void badPerformance(){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int counter= 0;
		
		int[] numbers = {1,0,0,4,3,5,0,8,0};
		System.out.println("Before: " + Arrays.toString(numbers));
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] ==0){
				counter++;
			}
			else
			map.put(i-counter, numbers[i]);					
		}
		
	   for (int j = 1; j <= counter; j++) {
		   map.put(numbers.length - j, 0);
	   }
	   
	   for (int i = 0;i < numbers.length;i++) {	
		   numbers[i] = map.get(i);
		}	
		System.out.println("After:   " + Arrays.toString(numbers));
	}
	
	public static void goodPerformance(){
		int counter= 0;	
		int[] numbers = {1,0,0,4,3,5,0,8,0};
		
		System.out.println("Before:     " + Arrays.toString(numbers));
		//Push All non-zero numbers to the front of the array.
		for (int i = 0; i < numbers.length; i++) {			
			if(numbers[i] ==0){counter++;}
			else{numbers[i-counter]= numbers[i];}	
		}
		
		System.out.println("In-Between: " + Arrays.toString(numbers));
		
		//fill the back of the array with the total number of zeros.
		 for (int j = 1; j <= counter; j++) {
			   numbers[numbers.length - j]=0;
		   }
		System.out.println("After:      " + Arrays.toString(numbers));
	}

}
