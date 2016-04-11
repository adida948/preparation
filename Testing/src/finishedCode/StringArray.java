package finishedCode;

import java.util.HashMap;

public class StringArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "palle";
		String input2 = "pae";
		
		System.out.println(getString(input,input2));
	}
	
	public static boolean getString(String a, String b){
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		char[] input1 = a.toCharArray();
		int counter = 0;
		for(int i = 0; i  < input1.length;i++){
		    
			if(charMap.containsKey(input1[i])){
				charMap.put(input1[i], charMap.get(input1[i]) + 1);
			}
			else
				charMap.put(input1[i], 1);
		}
		
		
		char[] input2 = b.toCharArray();
		
		for(int i = 0; i  < input2.length;i++){
		    
		if(!charMap.containsKey(input2[i])){
		  		counter++;
		  }
		else{
			charMap.put(input2[i], charMap.get(input2[i]) - 1);
			if(charMap.get(input2[i]) < 0) return false;
			
		}
		}
		
		
		
		if(input1.length - (input2.length - counter) == 1 || input1.length - (input2.length - counter) == 0){
			return true;
		}
		else 
			return false;
		
	}

}
