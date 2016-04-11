package finishedCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DatesFee {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int actualDay = sc.nextInt();
        int actualMonth = sc.nextInt();
        int actualYear = sc.nextInt();
        
        Calendar cal = Calendar.getInstance();
        cal.set(actualYear, actualMonth-1, actualDay,0,0,0);
         
        Date d1  = cal.getTime();
       System.out.println();
     
        int expectedDay   = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear  = sc.nextInt();
        
        Calendar cal2 = Calendar.getInstance();
        cal2.set(expectedYear, expectedMonth-1, expectedDay,0,0,0);
        
        Date d2 = cal2.getTime();
  /*      long diff = d1.getTime() - d2.getTime();

        System.out.println("Difference between  " + d1 + " and "+ d2+" is "
        + (diff / (1000 * 60 * 60 * 24)) + " days.");
        
        System.out.println("Actual day:" + actualDay + " Month: " + actualMonth + " Year: " + actualYear);
        System.out.println("expectedDay:" + expectedDay + " Month: " + expectedMonth + " Year: " + expectedYear);
        */
        System.out.println(getFine(d1,d2));
    }
    
    @SuppressWarnings("deprecation")
	public static int getFine(Date actualDay, Date expectedDay){
    	
        long diff = actualDay.getTime() - expectedDay.getTime();

        long dateDiff = diff /(1000 * 60 * 60 * 24);
        
    	if( dateDiff <= 0)
    	{
    		return 0;
    	}
    	else if( actualDay.getMonth() == expectedDay.getMonth()){
    		
    		return 15*(int)dateDiff;
    	}
    	else if( actualDay.getYear() == expectedDay.getYear()){
    		int diffMonths =(actualDay.getMonth()+1) - (expectedDay.getMonth()+1);
    		
    		return 500*diffMonths; 
    	}
    	else if( actualDay.getYear() != expectedDay.getYear()){
    		return 10000;
    	}
    	
    	return 0;
    	
    }
}