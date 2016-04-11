package finishedCode;

import java.util.HashMap;
import java.util.Map;


//Find Repeated number-- Binary Search tree is faster logn
public class FindIndexArray {

	public static void main(String[] args)
	{		
		int[] array = {1,2,3,3,3,4,5,6,7,12,12,12,34,56,77,155,155};
		
		//Running time is N
		final long startTime = System.currentTimeMillis();
		System.out.println(getIndexNum(12));
		final long endTime= System.currentTimeMillis();
		
		System.out.println("Total execution time: " + (endTime - startTime) );		
		//Running time logN
		final long startTime1 = System.currentTimeMillis();
		System.out.println(getIndexNumFast(22,0,array.length-1,array));
		
		final long endTime2 = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime2 - startTime1) );		


		
		
		
	}
	
	public static int getIndexNum(int number){
		
		int[] array = {1,2,3,4,5,6,7,7,7,12,12,12,34,56,77,155};
		
	     for( int i = 0; i < array.length; i++){	    	 
	    	 if(array[i] == number){
	    		 
	    		 if( i == array.length-1)
	    			 return i;
	    		 else if( array[i+1] != number){
	    			 return i;
	    		 }
	    	 }	 
	     }	     
	     return -1;
		
	}
	
	public static int getIndexNumFast(int number,int startIndex, int endIndex,int[]arr){
		
		
		int solution = -1;
		int pivotIndex = (startIndex + endIndex)/2;
		
		if(startIndex > endIndex)
			return solution;
				
		if( number == arr[pivotIndex]){ 		
    			 
    		 while( pivotIndex < arr.length-1 && arr[pivotIndex+1] == number){
    				  pivotIndex++;	 
    		   }
    			 return pivotIndex;		 
    			
		}
		else if(arr[pivotIndex] > number)
		 solution = getIndexNumFast(number,startIndex,pivotIndex-1,arr);
		else 
		 solution= getIndexNumFast(number,pivotIndex+1,endIndex,arr);

			
		return solution;
	}
}
