package finishedCode;

public class GroupSum {
	
	public static boolean groupSum(int start, int[] nums,int target){
		  if(start >= nums.length) return target == 0;
		  
		  if(groupSum(start+1,nums,target-nums[start])) return true;
		  
		  if(groupSum(start+1,nums,target)) return true;
		  
		  return false;
	}
	
	static public void main(String args[]){
		
		int[] test ={2,4,8};
		
		System.out.println(groupSum(0, test, 10));
		
		String a =  new String("a");
		String b = new String("a");
		
		
		
		if ( a == b)
		{
			System.out.println("FUCKU");
		}
		
		a = "a";
		b = "a";
		
		if ( a == b)
		{
			System.out.println("NOFUK");
		}
		
		
		
	}

}
