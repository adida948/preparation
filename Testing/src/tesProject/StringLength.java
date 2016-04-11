package tesProject;

public class StringLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		String strInquiry ="Many people who edit Wikipedia do so because they enjoy writing; however, that passion can result in overlong composition. This ref" +
				           "lects a lack of time or commitment to refine an effort through successively more concise drafts. With some application, natural redun" +
				           "dancies and digressions can often be eliminated. Recall the venerable paraphrase of Pascal, " +
				           "I made this so long because I did not have time to make it shorter. A second contributing factor can be";
        int nLimit = 132;

		
			
		
		for (int i = 0; i < strInquiry.length(); )
        {
            if (i + nLimit > strInquiry.length())
                System.out.print(strInquiry.substring(i));
            else
            	System.out.print(strInquiry.substring(i, i+nLimit - 1));
            
            //strInquiry = strInquiry.substring(i);
            i = i + nLimit-1;
            
            System.out.println();
        }
		*/
		
		
		String testText = "" +
				"*2016-04-06//22:42:01//d.carrion//Inbound//Resolution<BR>Resolution	2016-04-05//21:41:13//TECH SUPP" +
				"ORT AGENT[*d.carrion] MPR AUTHORIZATION - The Apple logo is a trademark of Apple Inc., registered in" +
				" the U.S. and other countries. App Store is a service mark of Apple Inc. | Amazon, Kindle, Fire and all related logos are trademarks of Amazon.com, Inc. or its affiliates. | BlackBerry is the trademark or " +
				"registered trademark of BlackBerry Limited, the exclusive rights to which are expressly reserved. Cigna is not affiliated with, endorsed, sponsored, or otherwise authorized by BlackBerry " +
				"Limited.// CHANNEL // NO CHANNELS TUNED // ANTENNA CABLE</BR>";
		
		String paresedText = 		testText.replace("<BR>"," ").replace("</BR>","");
		//parseText(paresedText);
		
		String inquery = "*2016-04-06//22:42:00//d.carrion//Inbound//Inquiry<BR>Inquiry	2016-04-05//21:41:13//TECH SUPPORT AGENT[*d.carrion] new " +
				"inquiry type - The Apple logo is a trademark of Apple Inc., registered inthe U.S. and other countries. App Store is a service mark " +
				"of Apple Inc. | Amazon, Kindle, Fire and all related logos are trademarks of Amazon.com, Inc. or its affiliates. | BlackBerry is the" +
				" trademark or registered trademark of BlackBerry Limited, the exclusive rights to which are expressly reserved. Cigna is not affiliated" +
				" with, endorsed, sponsored, or otherwise authorized by BlackBerry Limited.// CHANNEL // NO CHANNELS TUNED // ANTENNA CABLE ";
		

		parseInquery(inquery);
	}
	
	public static void parseInquery(String inq_text){
		int nLimit = 132;
		for (int i = 0; i < inq_text.length(); )
        {
            if (i + nLimit > inq_text.length())
                System.out.print(inq_text.substring(i)+ "<br>");
            else
            	System.out.print(inq_text.substring(i, i+nLimit - 1) + "<br>");
            
            //strInquiry = strInquiry.substring(i);
            i = i + nLimit-1;
            
            System.out.println();
        }
		
	}
	
	public static void parseText(String testText){
		

		/*int resol_len = testText.length();
		if( resol_len > 100)
		{
			int j =0;
			while( resol_len > 100)
			{
				resol_len = resol_len - 100;
				System.out.println( testText.substring(j*100, (j+1)*100-1 ) + "<br>");
				j++;
			}
		}*/
		
		
		int nLimit = 132;
		for (int i = 0; i < testText.length(); )
        {
            if (i + nLimit > testText.length())
                System.out.print(testText.substring(i)+ "<br>");
            else
            	System.out.print(testText.substring(i, i+nLimit - 1) + "<br>");
            
            //strInquiry = strInquiry.substring(i);
            i = i + nLimit-1;
            
            System.out.println();
        }
		
	}

}
