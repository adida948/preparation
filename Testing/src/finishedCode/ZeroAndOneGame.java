package finishedCode;

public class ZeroAndOneGame {
	
	public static void main (String[] args){

		int jumpValue = 5;
		int[] input = {0,0,0,1,1};
		
		
		System.out.println(isGameWon(input,jumpValue));
	}   
       public static boolean isGameWon(int[] input, int jumpValue){
		
    	
    	 for(int i = 0; i < input.length; i++){
    		 
    		if(input[i]==0){
    			
    			if(i+jumpValue > (input.length-1)){
    				return true;
    			}
    			else{
    				i = i+jumpValue;
    			}
    		}
    	 }
    	   
    	   
         return false;
	}

}
