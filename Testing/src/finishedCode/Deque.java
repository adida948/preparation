package finishedCode;

import java.lang.reflect.Method;
import java.util.ArrayDeque;

import java.util.Scanner;

/*


Sample Input
Using Deque
6 3
5 3 5 2 3 2
Sample Output

3*/
public class Deque {

	public void getMethods(){
	
		Class a = new Deque().getClass();
		Method[]  methods = a.getMethods();
		
	
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		java.util.Deque<Integer> numDeque = new ArrayDeque<Integer>();
		int[] numArray = new int[10000001];
		int i = 0;
		int n = in.nextInt();
		int m = in.nextInt();
 

		int maxUniqueNums = 0;
		int counter = 0;
		for (; i < m; i++) {

			int num = in.nextInt();
			if (numArray[num] == 0) {
				counter++;
				if (maxUniqueNums < counter)
					maxUniqueNums = counter;
			}
			numArray[num]++;
			numDeque.addLast(num);
		}
		
		for (; i < n; i++) {
			if (numArray[(int) numDeque.getFirst()] == 1)
				counter--;
			numArray[(int) numDeque.getFirst()]--;
			numDeque.removeFirst();
			int x = in.nextInt();
			if (numArray[x] == 0) {
				counter++;
				if (maxUniqueNums < counter)
					maxUniqueNums = counter;
			}
			numArray[x]++;
			numDeque.addLast(x);
		}
		System.out.println(maxUniqueNums);
		
		Deque test = new Deque();
		test.getMethods();
	}
}
