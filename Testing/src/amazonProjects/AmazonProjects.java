package amazonProjects;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Get repeated word after tokinzeer 
public class AmazonProjects {
	
	   public static void main(String[] args) {
	       
		  
		  System.out.println(firstRepeatedWord("Had  Had quite enough of this nonsense."));
	        
	    }
	   
	   
	   static String firstRepeatedWord(String s) {
	        

	        
	        //String[] arrayOfWords = s.replace(",", " ").replace(":", " ").replace("\t"," ").replace(";", " ").replace("-", " ").replace(".", " ").split(" ");
	          
	        //String[] arrayOfWords2 = s.replace(",", " ").replace(":", " ").replace("\t"," ").replace(";", " ").replace("-", " ").replace(".", " ").split(" ");
	        
	        String[] arrayOfWords = s.trim().split("([^a-zA-Z])+");
	        Map<String,Boolean> myHashMap = new HashMap<String, Boolean>();
	        
	       	for( String elem: arrayOfWords ){
		        	
	       		//if(myHashMap.containsKey("")) continue;
		        	if(myHashMap.containsKey(elem)){	
		        		return elem;
		        	}
		        	else 
		        		myHashMap.put(elem, true);
		   }
	        
	        return " ";
	        


	    }


}
