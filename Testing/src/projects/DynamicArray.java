package projects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class DynamicArray {

/*https://www.hackerrank.com/challenges/dynamic-array
 * 
 * Sample Input

2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1
	
	Sample Output
	7
	3
 * 
 * 
 * 
 * */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        SortedMap<String,String> myMap = new TreeMap<String, String>(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				if(o1.equals(o2)){
					return 0;
				}
				
				return o1.compareTo(o2) > 0 ? -1: 1;
			}
        	
        });
        
        
        
        myMap.put("1", "2");
        myMap.put("3", "2");
        myMap.put("9", "2");
        myMap.put("6", "4");
    
        NavigableSet<String> nset= ((TreeMap<String, String>) myMap).descendingKeySet();

        System.out.println(nset);
        
        for (Object num: myMap.keySet()) {
        	
        	System.out.println("\nkey: " + num + " value: " + myMap.get(num));
			
		}
        
        for(String values : myMap.values()){
        	System.out.println("values: " + values);

        }
        
   
        
        
        List<List<Integer>> seqs = new ArrayList<List<Integer>>(N); 
        
        for(int i = 0; i < N ; i++){
            seqs.add(i,new ArrayList<Integer>());
        }
        int lastAns = 0;        
        while(Q > 0){
            int seqType = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            //Add to the DS
            if( seqType == 1){                
                seqs.get( (x ^ lastAns)%N).add(y);
            }
            else if(seqType == 2){
             int sizeofSeq =   seqs.get((x ^ lastAns)%N).size();
             int elem = seqs.get((x ^ lastAns)%N).get(y%sizeofSeq);
             System.out.println(elem); 
             lastAns =  elem;              
            }
            
            Q--;
        }
        
    }
}
