package projects;

public class NumCentCoins {

//Given Unlimited quarter, dimes, nickels and pennies, calculate the number of ways
//	that can represent n cents. 
	
	public static void main(String[] args)
	{
		
		System.out.println(NumCentCoins.numWays(10,25));
			
		
	}

	public static int numWays(int input, int denominator){
		
		if(input == 0){
			return 1;
		}
		else if( input < 0)
		{
			return 0;
		}
		int answer = 0;
		
		switch (denominator) {
		case 25:
			answer+= numWays(input-25,25);	
		case 10:
			answer+= numWays(input-10,10);		
		case 5:
			answer+= numWays(input-5,5);		
		case 1:
			answer+= numWays(input-1,1);		
		}
		
		return answer;
	}
}
