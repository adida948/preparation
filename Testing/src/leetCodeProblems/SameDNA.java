package leetCodeProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class SameDNA {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int c = in.nextInt();
    for(int i=0;i<c;i++){
        int len = in.nextInt();
        ArrayList<Integer> arra = new ArrayList<Integer>();
        ArrayList<Integer> arrb = new ArrayList<Integer>();
        
        for(int j=0;j<len;j++){
            arra.add(in.nextInt());
        }
          for(int j=0;j<len;j++){
            arrb.add(in.nextInt());
        }
        if(relateveRecv(arra,arrb,0,Integer.MIN_VALUE,false))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
	}
	
	public static boolean relateveRecv(ArrayList<Integer> arrayA, ArrayList<Integer> arrayB,int start, int minVal, boolean truth){
		
		
		return true;
	}
}
