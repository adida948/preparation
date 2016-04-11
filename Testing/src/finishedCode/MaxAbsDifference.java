package finishedCode;

import java.util.Scanner;

public class MaxAbsDifference {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

      	System.out.print(D.maximumDifference);
    }
}



class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	 public Difference(int[] input){
         this.elements = input;
     }

 public int computeDifference(){
     maximumDifference = Integer.MIN_VALUE;
     int tempDifference = 0;
     for(int i = 0; i < elements.length; i++)
         {
             for( int j = i+1; j < elements.length; j++)
              {
                  tempDifference = Math.abs(elements[i] - elements[j]);
                  if( tempDifference > maximumDifference){
                      maximumDifference = tempDifference;
                  }
              }

     }
     return maximumDifference;
 }
}