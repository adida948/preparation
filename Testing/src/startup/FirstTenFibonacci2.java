package startup;

import java.util.Arrays;

//Get An array with the first N fib numbers  N > 0  and  N<=1=

public class FirstTenFibonacci2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for( int elem: fibonacci(3)){
			System.out.println(elem);
		}
	}
	

  public  static int[] fibonacci(int n) {
    
    //Create a used Array for Dynamic Programming
    int[] bitArray = new int[n+1];
    
    //fill Array with -1s 
    Arrays.fill(bitArray,-1);
    
    //Use Helper method to print    
    printFibo(bitArray,n);
    
    //when n = 0, result is 0
    bitArray[0] = 0;

    //return the modified array
    return bitArray;
       
    }

    static int printFibo(int[] compareArray, int n){
        
        //Checking for the first values
        if(n == 1 || n == 2){
            //if values are not in the array, put them
            if(compareArray[n] == -1){
                compareArray[1] = 1;
                compareArray[2] = 1;
            }
            return 1;
        }
        
        int temp = 0;
        
        //If value is not in Array(since it has -1), fill that spot with the correct value
        if(compareArray[n] == -1){
            temp = printFibo(compareArray,n-1) + printFibo(compareArray,n-2);
            compareArray[n] = temp;
        }
        
        // If compareArray[n] has other value than -1, then we call it right away(Constant speed)
        temp = compareArray[n];
        return temp;
    }

}
