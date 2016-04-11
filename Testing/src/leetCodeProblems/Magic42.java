package leetCodeProblems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Magic42 {


    public static void main(String[] args) {
      
        System.out.println(isUltimateNum(12,5,6));
    }
    
    public static String isUltimateNum(int a, int b, int c){
    	 
       if( a+b <42 || a*b < 42 || b*c < 42 || b+c<42 ){
       int answer1 = a + b + c;      
       int answer2 = a + b * c;
       int answer3 = a * b + c;
       int answer4 = a * b * c;
       
       if(answer1 == 42 )
           return a +"+" + b + "+"+ c;
       else if( answer2 == 42)
           return a +"+" + b + "*"+ c;
       else if( answer3 == 42)
           return a +"*" + b + "+"+ c;
       else if( answer4 == 42)
           return a +"*" + b + "*"+ c;}
       
           return "This is not the ultimate question";



    
}
}
