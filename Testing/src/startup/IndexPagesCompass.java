package startup;

/*
 * Take an array of "pages" from a book and create an index for   
 * each word
 * ["It was a dark and stormy night", "it was a dark time"] -> 
 * { "dark": [(0,3), (1,3)], "it": [(0,0), (1,0)], "stormy": [(0,5)] }
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.JUnitCore;

public class IndexPagesCompass {
	HashMap<String, ArrayList<Pair>> compiledMap = new HashMap<String, ArrayList<Pair>>();

	public static class Pair {
		public int pageNum, wordNum;

		public Pair(int pageNum, int wordNum) {
			this.pageNum = pageNum;
			this.wordNum = wordNum;
		}

		public String toString() {
			return "(" + this.pageNum + "," + this.wordNum + ")";
		}
	}

	@Test
	public void testLookup() {
		ArrayList<String> pages = new ArrayList<String>();
		pages
				.add("Call me Ishmael. Some years ago—never mind how long precisely—having little or no money in my purse, and nothing particular to interest me on shore, I thought I would sail about a little and see the watery part of the world. It is a way I have of driving off the spleen and regulating the circulation. Whenever I find myself growing grim about the mouth; whenever it is a damp, drizzly November in my soul; whenever I find myself involuntarily pausing before coffin warehouses, and bringing up the rear of every funeral I meet; and especially whenever my hypos get such an upper hand of me, that it requires a strong moral principle to prevent me from deliberately stepping into the street, and methodically knocking people's hats off—then, I account it high time to get to sea as soon as I can. This is my substitute for pistol and ball. With a philosophical flourish Cato throws himself upon his sword; I quietly take to the ship. There is nothing surprising in this. If they but knew it, almost all men in their degree, some time or other, cherish very nearly the same feelings towards the ocean with me.");
		pages
				.add("There now is your insular city of the Manhattoes, belted round by wharves as Indian isles by coral reefs—commerce surrounds it with her surf. Right and left, the streets take you waterward. Its extreme downtown is the battery, where that noble mole is washed by waves, and cooled by breezes, which a few hours previous were out of sight of land. Look at the crowds of water-gazers there.");
		pages
				.add("Circumambulate the city of a dreamy Sabbath afternoon. Go from Corlears Hook to Coenties Slip, and from thence, by Whitehall, northward. What do you see?—Posted like silent sentinels all around the town, stand thousands upon thousands of mortal men fixed in ocean reveries. Some leaning against the spiles; some seated upon the pier-heads; some looking over the bulwarks of ships from China; some high aloft in the rigging, as if striving to get a still better seaward peep. But these are all landsmen; of week days pent up in lath and plaster—tied to counters, nailed to benches, clinched to desks. How then is this? Are the green fields gone? What do they here?");

		compileLookup(pages);

		Assert.assertEquals("[(0,37), (0,41), (0,52), (0,56), (0,65), (0,89), (0,122), (0,167), (0,193), (0,197), (1,7), (1,28), (1,37), (1,64), (2,1), (2,31), (2,47), (2,52), (2,57), (2,67), (2,107)]",
						lookupWord("the").toString());

		Assert.assertEquals("[(2,6)]", lookupWord("sabbath").toString());

		Assert.assertEquals("[(0,162)]", lookupWord("sword").toString());
	}

	public void compileLookup(ArrayList<String> pages) {
		// TODO

		for (int i = 0; i < pages.size(); i++) {
			System.out.println(pages.get(i));

			// Get words from String
			String[] words = pages.get(i).trim().toLowerCase().split(
					"[^a-zA-Z'-]+");

			for(String element: words){
				System.out.println(element);
			}

			// Iterate through the words
			for (int j = 0; j < words.length; j++) {
				// Create Pair Object
				Pair element = new Pair(i, j);
				
				//Create ArrayList
				ArrayList<Pair> wordList = new ArrayList<Pair>();

				if (!compiledMap.containsKey(words[j])) {
					wordList.add(element);
					compiledMap.put(words[j], wordList);
				} else {
					wordList = compiledMap.get(words[j]);
					wordList.add(element);	
					//We don't need this one because it is reference of arraylist
					//compiledMap.put(words[j], wordList);
				}
			}

		}

	}
	
	public void compileLookup2(ArrayList<String> pages) {
		// TODO
		  // TODO
	    for(int i = 0 ; i < pages.size(); i++){
	  
	       String[] pagesInput = pages.get(i).split("[^a-zA-Z'-]");
	       
	       int wordNum =0;
	       for( int j = 0; j < pagesInput.length;j++){
	         System.out.println(pagesInput[j]);
	         String word = pagesInput[j].toLowerCase();
	         if(word.trim().equals(""))
	           continue;
	         Pair pair = new Pair(i,wordNum);
	         if(!compiledMap.containsKey(word)){
	           
	           ArrayList<Pair> list = new ArrayList<Pair>();
	           list.add(pair);
	           compiledMap.put(word,list );
	         }
	         else{
	           ArrayList<Pair> list = compiledMap.get(word);
	           list.add(pair);
	         }
	         wordNum++;
	       }
	       
	    }

	}

	public List<Pair> lookupWord(String word) {
		// TODO
		return compiledMap.containsKey(word)? compiledMap.get(word): new ArrayList<Pair>();
	}

	public static void main(String[] args) {
		JUnitCore.main("IndexPagesCompass");
	}
}
