package leetCodeProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(reverse(1534236469));
		System.out.println(fasterReverse(1534236469));
		
	
	}
	
	
	public static int reverse(int x) {
        System.out.println(x);
        //Declare variables 
        int newNumber = 0;
        int temp =0;
        boolean isNegative = false;
        int val = Integer.MAX_VALUE / 10;
        //Check if num is negative
        if(x < 0){
         x = Math.abs(x);
         isNegative = false;
        }
       
       
        while( x > 0){   
        	if (newNumber > val || newNumber == val && Integer.MAX_VALUE % 10 < x)
				return 0;
			else{
				
            temp = x%10;
            newNumber = newNumber*10 + temp;
            x = x/10;
			}
        }
        
        if(newNumber < 0){
            newNumber = 0;
        }
        
        return  isNegative ? (-1)*newNumber: newNumber;
    }
	
	public static int fasterReverse(int x){
	     int result = 0;
	        while(x != 0)
	        {
	        	//Get Digits
	            int newResult = result*10 + x%10;
	            if((newResult - x%10)/10 != result)
	                return 0; 
	            x = x/10;
	            result = newResult;
	        }
	        return result;
	    }
	
	
	

}
