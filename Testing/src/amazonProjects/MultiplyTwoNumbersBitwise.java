package amazonProjects;

public class MultiplyTwoNumbersBitwise {

	public static void main(String[] args) {

		int a = 3;
		int b = 5;

		System.out.println(getMultipliedNum(a, b));

	}

	public static int getMultipliedNum(int a, int b){
		
		if(a==0 || b==0) return 0;
		int sum = 0;
		int mask= 1;
	
		for(int i= 0; i < 4; i++){
			// A*B = A*(2^0 + 2^1)
			// A*B = A*(2^0) + A*(2^1)
			if((b & mask<<i)>0){
				sum += a << i;
			}
		
		}
		
		
		
	     	
		return sum;
	}
}