package projects;

public class QuickSort {
	
	 public static void quickSort(int[]arr, int left, int right){		 
		 
		 int index = partiton(arr,left,right);
		 
		 if( left < index-1){
			 quickSort(arr,left, index-1);
		 }
		 if(index < right){
			 quickSort(arr,index, right);
		 }
	 }
	 
	 public static int partiton(int[]arr, int left, int right){
		 int i = left;
		 int j = right;
		 int temp;
		 int pivot = arr[(left+right)/2];
		 
		 while(i <= j){
			 while(arr[i] < pivot)
				 i++;		 
			 while(arr[j] > pivot)
				 j--;
			 if( i <= j){
				 temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
				 i++;
				 j--;
			 }
		 }
		 
		 return i;
	 }

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		int[]unsortedArray = {5,23,3,3,5,5,55,55,4};
		
		quickSort(unsortedArray,0,8);
		
		for (int i = 0; i < unsortedArray.length-1; i++) {
			System.out.print(unsortedArray[i] + " ");
		}

	}

}
