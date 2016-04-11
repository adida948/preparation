package finishedCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Output Format
 In each line, output the number located in ythyth position of xthxth line. If there is no such position, just print "ERROR!"

 Sample Input

 5
 5 41 77 74 22 44
 1 12
 4 37 34 36 52
 0
 3 20 22 33
 5
 1 3
 3 4
 3 1
 4 3
 5 5
 Sample Output

 74
 52
 37
 ERROR!
 ERROR!*/
public class ArrayListWithinArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mainListSize = sc.nextInt();

		ArrayList<ArrayList<Integer>> dataArray = new ArrayList<ArrayList<Integer>>();

		while (mainListSize > 0) {

			int innerListSize = sc.nextInt();
			ArrayList<Integer> innerList = new ArrayList<Integer>();
			while (innerListSize > 0) {

				innerList.add(sc.nextInt());
				innerListSize--;
			}
			dataArray.add(innerList);
			mainListSize--;

		}
		int querySize = sc.nextInt();

		while (querySize > 0) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			try {
				System.out.println(dataArray.get(x).get(y));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
			querySize--;
		}

	

	}
}
