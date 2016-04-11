package amazonProjects;

// Create Fib Sequence with Dynamic programming //
// Running time with dynamic  O(n) linear
// Running time withouth 2^n
import java.util.Arrays;

public class DynamicProgrammingFibonnacci {

	
	public static void main(String[] args){
		
		int fibNum = 0;
		
		System.out.println(getFibNum(fibNum));
	}
	
	public static int getFibNum(int input){
		int[] content = new int[input+1];
		Arrays.fill(content, -1);
		
		return getNum(input,content);
	}
	
	public static int getNum(int n, int[] numArray){
		
		if(numArray[n] != -1){
			return numArray[n];
		}
		
		if(n == 0){ 
			numArray[n]=0;
			return 0;}
		
		if(n == 1 || n == 2){
			numArray[n]=1;
			return 1;
		}
		
		int temp = getNum(n-1, numArray) + getNum(n-2,numArray);
		
		numArray[n] = temp;
		
		return temp;
			
	}
}
