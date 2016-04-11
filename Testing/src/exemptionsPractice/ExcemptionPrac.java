package exemptionsPractice;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class ExcemptionPrac {

	public static void main(String[] args) {

		ArrayList<Integer> result = new ArrayList();
	     
		
		Set<Integer> mySet = new TreeSet<Integer>();
	    mySet.toArray();
		int[] input = new int[5];
		
		int a = input.length;
		input[4] = 2;
		
		try {
			System.out.println("Getting number at index 4--> " + input[6]);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Exception throw " + e);
		}
		finally{
			System.out.println("Completed Successfully");
		}
	}

}
