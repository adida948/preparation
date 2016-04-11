package startup;

import java.util.Arrays;

/*Write a function get_products_of_all_ints_except_at_index()
  that takes an array of integers and returns an array of the products

For example, given: [2, 7, 3, 4,5]

your function would return: [84, 12, 28, 21]

by calculating: [7*3*4, 1*3*4, 1*7*4, 1*7*3]*/
public class ProductOfAllIntsInArray {
	
	public static void main (String[] args){
		
		int[] givenNums = {2,3,5,4,5};
		System.out.println(Arrays.toString(getArrayOfProducts(givenNums)));
		System.out.println(Arrays.toString(getProductArray(givenNums)));

	}
	
	//Not efficient n^2
	public static int[] getArrayOfProducts(int[] input){
		
		int[] productArray = new int[input.length];
		int productResult = 1;
		for(int i = 0; i < input.length;i++){
			for(int j = 0; j<input.length;j++){
				if(i == j) continue; 
				else
				productResult *= input[j]; 
			}
			productArray[i] = productResult;
			productResult = 1;
		}
		return productArray;
	}
	
	//n
	public static int[] getProductArray(int[] input){
		int[] resultArray = new int[input.length];
		int product = 1;
		for(int i = 1; i < input.length;i++){
			product *= input[i]; 
		}
		resultArray[0] = product;
		
		for(int j = 1; j < input.length; j++){
			resultArray[j] = (product/input[j])*input[0];
		}
		
		return resultArray;
	}
	
}


/* 
 * You have an array of integers, and for each index you want to find the product of every integer except the integer at that index
e.g.
I: [1, 7, 3, 4, 2]
O: [168, 24, 56, 42, 84] from

1 =             7*3*4*2
7 = 1*          3*4*2
3 = 1*7*        4*2
4 = 1*7*3*      2

public static int[] getProdutArray(int[] input){
int productResult =1;
int[] resultArray = new int[input.length];

// look here
for(int i = 1; i < input.length;i++){
  product *= input[i];  

}

resultArray[0] = product;


for(int j = 1; j < input.length; j++){

resultArray[j]   = (product/input[j] * input[0];

}
return resultArray;
*/
