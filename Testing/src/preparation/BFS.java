package preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
//Create a BreathFirstSearch and display all its contents

public class BFS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> myArrayList = new ArrayList();

		ArrayList<Integer> data = new ArrayList<Integer>();

		//data.add(1);
		//data.add(2);
		data.add(1);
		data.add(3);

		myArrayList.add(data);

		ArrayList<Integer> data2 = new ArrayList();
		data2.add(0);
		data2.add(2);
		myArrayList.add(data2);
		
		ArrayList<Integer> data3 = new ArrayList();
		//data3.add(0);
		data3.add(1);
		data3.add(4);
		myArrayList.add(data3);
		
		ArrayList<Integer> data4 = new ArrayList();
		//data4.clear();
		data4.add(0);
		data4.add(4);
		
		myArrayList.add(data4);

		ArrayList<Integer> data5 = new ArrayList<Integer>();
		data5.add(2);
		data5.add(3);
		
		myArrayList.add(data5);
		System.out.println("Contents:" + myArrayList.toString());

		int startVertix  = 0;
		

		Queue<Integer> myVisitedQueue = new LinkedList<Integer>();
		boolean[] isVisited = new boolean[5];

		myVisitedQueue.add(startVertix);
		//System.out.print(startVertix);
		while( !myVisitedQueue.isEmpty()){

			int currentVertex = myVisitedQueue.poll();
			
			System.out.println("Investigating Vertix:" + currentVertex);

			isVisited[currentVertex] = true;
			ArrayList<Integer> temp =  myArrayList.get(currentVertex);
			if(temp == null) 
				System.out.print("No edge" + currentVertex);
			for(int i = 0; i < temp.size(); i++){

				
				if(isVisited[temp.get(i)] != true)
				{
					System.out.print("    - Edges: " + temp.get(i) + " ");
					isVisited[temp.get(i)] =  true;
					
				
					myVisitedQueue.add(temp.get(i));
				}
				else{
				    System.out.print("     - Vertix visited already: " + temp.get(i));
				}
				
				System.out.println();

			}

		}


	}
}
