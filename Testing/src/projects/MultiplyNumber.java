package projects;

import java.util.Arrays;



public class MultiplyNumber {

	public static int[]  getAllProduct(int[] numbers){
		
		int product = 1;
		int i =0;
		int[] multiplied = new int[numbers.length];
		Arrays.fill(multiplied, 1);
		
		
		while (i <numbers.length) {
			
			multiplied[i] = product;
			product *= numbers[i];
			i++;
			
		}
		
	    product = 1;
	    i = numbers.length-1;
	
	    while (i >=0) {
	    	
	    	multiplied[i] *=product;
	    	product *= numbers[i];
	    	i--;
			
		}
	    
	    return multiplied;
		
	}
	
	public static void main(String[] args){
		
		int[] test = new int[]{1,7,3,4};
		
		int[] result = getAllProduct(test);
		System.out.println(Arrays.toString(result));
		
	}
	
}
