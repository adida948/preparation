package finishedCode;

public class StringPermutation {

	
	public static void main(String[] args){
		
		String input = "Hello";
		
		showAllPermutations(input, "");
	}
	
	public static void showAllPermutations(String input, String prefix){
		
		if(input.length() == 0){
			System.out.println(prefix);
		}
		else{
			for(int i =0; i < input.length();i++){
				
				String rem = input.substring(0, i) + input.substring(i+1);
				showAllPermutations(rem, prefix + input.charAt(i));
			}
		}
		
	}
}

