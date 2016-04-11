package finishedCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

//Hashset uses hashcode to put value into a bucket index. 
//HashSet has O(1) input and retrival
/*INput: 
 * 
 5
 john tom
 john mary
 john tom
 mary anna
 mary anna
 OUTPUT
 1
 2
 2
 3
 3

 Explanation

 After taking the first input, you have only one pair: (john,tom)
 After taking the second input, you have two pairs: (john, tom) and (john, mary)
 After taking the third input, you still have two unique pairs.
 After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary, anna)
 After taking the fifth input, you still have three unique pairs.
 */
public class HashSetHowManyRealPairs {

	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int size = sc.nextInt();
	        sc.nextLine();
	        HashSet<String> inputSet = new HashSet<String>();
	        
	        while(size > 0){
	            String sentence = sc.nextLine();
	            inputSet.add(sentence);
	            System.out.println(inputSet.size());
	            size--;
	        }
	        
	    }

}