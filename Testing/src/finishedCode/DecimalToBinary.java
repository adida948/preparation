package finishedCode;


public class DecimalToBinary {
	
	public static void main(String[]args) {
		
		int num1 = 23;
		int num2 = 33;
		
		System.out.println(getBinary(num1));
		System.out.println(getBinary(num2));
		
	}
	
	public static String getBinary(int number){
		
		String  binary = "";
		while( number > 0)
		{
			if(number% 2 == 0){
			
			  binary += "0";
			}
			else
			  binary += "1";
			
			number = number/2;
		}

		
		return new StringBuffer(binary).reverse().toString();
	}

}
