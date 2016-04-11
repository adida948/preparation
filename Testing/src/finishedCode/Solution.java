package finishedCode;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] array = {"5 26"};
		count_Squares(array);

	}
	
	 static void count_Squares(String[] arr) {
	        
	        
	        int startR = Integer.parseInt(arr[0].split(" ")[0]);
	        int endR   = Integer.parseInt(arr[0].split(" ")[1]);
	        int counter = 0;
	        double sqrtS = Math.sqrt(startR);
	        double sqrtE = Math.sqrt(endR);
	        
	        int beginNum = (int)Math.ceil(sqrtS);
	        int endNum   = (int)Math.floor(sqrtE);
	        
	        counter= (endNum - beginNum) + 1;
	        /*
	        boolean firstEl = false;
	        boolean secondEl = false;

	        double test = sqrtS%1;
	        if(sqrtS%1 == 0){
	        	firstEl = true;
	        }
	        
	        if(sqrtE%1 == 0)
	        	secondEl = true;
	        
	        
	        int sqrtStart =(int) Math.ceil(sqrtS) ;
	        int sqrtEnd =  (int) Math.floor(sqrtE);
	       
	        
	        int difference = (int) (sqrtE - sqrtS);
		       
	        if( difference == 0 && !secondEl && !firstEl)
	        	counter = 0;
	        else
	        counter = (int) (sqrtEnd - sqrtStart) + 1;*/
	        
	        
	     /*   
	        for(int i = start; i <= end;i++){
	        	double squareRoot  = Math.sqrt(i);
                int intValue = (int)squareRoot;
                double difference = squareRoot - intValue;
	            if( difference == 0.0  )
	            {
	            	if(squareRoot*squareRoot == i )
	                counter++;
	            }
	        }*/
	
	      System.out.println(counter);
	    }

}
