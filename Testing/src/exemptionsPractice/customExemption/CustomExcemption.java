package exemptionsPractice.customExemption;

import java.util.concurrent.TimeUnit;

public class CustomExcemption {

	public static final double TOO_HOT = 185;
	public static final double TOO_COLD = 160;

	public static void drinkHotChocolate(double cocoaTemp) throws TooHotException,
			TooColdException {
		if (cocoaTemp >= TOO_HOT) {
			throw new TooHotException();
		} else if (cocoaTemp <= TOO_COLD) {
			throw new TooColdException();
		}
	}

	// We threw an exeption and catched it in the main method
	public static void main(String[] args) throws  InterruptedException{
		  double currentCocoaTemp = 170;
	        boolean wrongTemp = true;
	        while (wrongTemp) {
	            try {
	                drinkHotChocolate(currentCocoaTemp);
	                System.out.println("That cocoa was good!");
	                wrongTemp = false;
	            } catch (TooHotException e1) {
	                System.out.println("THAT'S TOO HOT!");
	                currentCocoaTemp = currentCocoaTemp - 5;
	            } catch (TooColdException e2) {
	                System.out.println("THAT'S SO COLD! It's like the arctic");
	                currentCocoaTemp = currentCocoaTemp + 5;
	            }
	            
	            TimeUnit.SECONDS.sleep(2);
	        }
	        

	        System.out.println("And it's gone.");
	    }
}
