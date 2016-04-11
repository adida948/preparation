package finishedCode;
import java.io.*;
import java.util.*;
/*
merge two arrays 
a = [1,2,3,4,4,4,4,5,6,6,6,7];
b = [1,2,2,2,2,2,5,8];

c = [1,2,5];

no duplicate
keep the order
    

*/
class DuplicateTwoSortedArrays {
  public static void main(String[] args) {
    
    int[] a = {1,2,3,4,4,4,4,5,6,6,6,7,8};
    int[] b = {1,2,2,2,2,2,5,8};
    int[] c = mergeArray(a,b);
    
   
    System.out.println(Arrays.toString(c));
  }  
  
  public static int[] mergeArray(int[] a, int []b){
	  int firstNumberArray = 0;
	  int secondNumberArray = 0;
	  
	  
	  ArrayList<Integer> numlist = new ArrayList<Integer>();
	  
	  //Make sure that loops stops when either the first or second array finishes
	  while(firstNumberArray < a.length && secondNumberArray < b.length){
	      //If number in first array is less than the number in second, then we go to the next number in first array
		  if(a[firstNumberArray] < b[secondNumberArray]){
	    	  firstNumberArray++;
	      //If number in first array is greater than the number in the second, then we stop and increase the index of the second array. 	  
	      }else if(a[firstNumberArray] > b[secondNumberArray]){
	          secondNumberArray++;
	      //if both numbers being compared are ==, then we add it to the arrayList and increase the index of both arrays
	      }else{
	    	  numlist.add(a[firstNumberArray]);
	    	  firstNumberArray++;
	          secondNumberArray++;
	      }
	  }
	  
	  //convert Arraylist to int[]
	  int[] answerArray = new int[numlist.size()];
	  for(int i = 0; i < numlist.size(); i++){
		  answerArray[i] = numlist.get(i);
	     }
	  return answerArray;
	  
	  //n^2
	  /*
	 int biggestElementA = a[a.length-1];
	 int biggestElemetnB = b[b.length-1];
	 int answerSize = biggestElementA >= biggestElemetnB ? biggestElementA:biggestElemetnB ;
	 boolean[] presentValues = new boolean[answerSize+1];
	 int counter = 0;
	 ArrayList<Integer> numlist = new ArrayList<Integer>();
     
	 //O(n)
     for(int i =0; i < a.length; i++){
    	 if(presentValues[a[i]] == false ){
    		 presentValues[a[i]] = true;
    	 }
     }
     
	 //O(n) 
     for(int j = 0; j < b.length; j++){
    	 if(presentValues[b[j]] == true ){
    		 System.out.println(b[j]); 
    		 presentValues[b[j]] = false;
    		 counter++;
    		 //O(n)
    		 numlist.add(b[j]);
    	 }
     }
     
     int[] answer = new int[counter];
     
     //O(n)
     for(int i = 0; i < answer.length; i++){
    	 answer[i] = numlist.get(i);
     }
	  
     return answer;*/
     
 ////////////nlogn
    //generic
/*  Set<Integer> numberSet = new TreeSet<Integer>();
  Set<Integer> answer = new TreeSet<Integer>();
  

  //n*logn
  for( int i = 0; i < a.length; i++){
     numberSet.add(a[i]);
  }

  //n*logn
  for(int j = 0; j < b.length; j++){

       if(numberSet.contains(b[j])){
         answer.add(b[j]);
      }
  }
    
    int[] returnValues = new int[answer.size()];
    int firstIndex = 0;
    
    //n
    for(Integer elem: answer){
      
      returnValues[firstIndex++] = elem;
    }
    
   // nlogn + nlogn + n
    
  return returnValues; */ 
	  
  }
}