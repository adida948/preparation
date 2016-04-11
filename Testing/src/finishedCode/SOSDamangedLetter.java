package finishedCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SOSDamangedLetter {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        String S = "SOSSOS234";
        System.out.println(getDamagedLetters(S));    
    }
    
    public static int getDamagedLetters(String input){
        int numMessages = input.length();
        char[] charInput = input.toCharArray();
        int counter = 0;
        for( int i = 0; i < numMessages;i+=3)
         {  
        
            if(charInput[i] != 'S')
                counter++;
            if(charInput[i+1] !='O')
            	counter++;
            if(charInput[i+2] != 'S')
            	counter++;
            
         }
        
        return counter;
    }
}
