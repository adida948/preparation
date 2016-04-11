package finishedCode;

//In this kind of problems you know the range of the elements
//in this example range is 1-7 and total number of elements is 8
public class FindRepeatedNumberXor {
	static int xorArray,dup;

	
	public static int findWithXOR(int[] input){
		int xorArray=1;
		for(int i=2; i<=(input.length-1);i++){
			xorArray = xorArray ^  i;
			System.out.println("XOR : " + xorArray);
		}
		System.out.println("XOR Array : " + xorArray);
		for(int k=0;k<=input.length-1;k++){
			xorArray = xorArray ^ input[k];
			System.out.println(xorArray);
		}
		System.out.println("Duplicate : " + dup);
		return xorArray;
	}	
	
		
	
	public static void main(String args[]){
		int[] _array = new int[]{2,2,1,3,4,5,6,7};
		
		

		int duplicate = findWithXOR(_array);
	    System.out.println("Duplicate:" + duplicate);
	}
	
}