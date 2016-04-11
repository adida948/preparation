package finishedCode;

public class CheckStringUniqueCharacters {

	public static void main(String[] args){
		
		System.out.println(isUnique("Hello Mofos How you doing?"));
	}
	
	public static boolean isUnique(String input){
		if(input.length() > 128) return false;
		boolean[] uniqueArray = new boolean[128];
		
		for(int i = 0; i < input.length(); i++){
			int value = input.charAt(i);
			
			if(uniqueArray[value] == true)
				return false;
		
		   uniqueArray[value]= true;
	
		}
		return true;
	}
}
