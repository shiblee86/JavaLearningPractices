package com.javafordummies;

import java.util.ArrayList;
import java.util.List;

public class PhraseOMatic {

	public static void main(String[] args) {

		// make three sets of words to choose from. Add your own!
		String[] wordListOne = { "24/7", "multi- Tier", "30,000 foot", "B-to-B", "win-win", "front- end", "web-based",
				"pervasive", "smart", "six- sigma", "critical-path", "dynamic" };
		String[] wordListTwo = { "empowered", "sticky", "value-added", "oriented", "centric", "distributed",
				"clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned",
				"targeted", "shared", "cooperative", "accelerated" };
		String[] wordListThree = { "process", "tipping- point", "solution", "architecture", "core competency",
				"strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission" };
		
		List<String>wordListOne1 = new ArrayList<>();
		wordListOne1.add("24/7");
		wordListOne1.add("multi- Tier");
		
		System.out.println(wordListOne1);

		// find out how many words are in each list
				int oneLength = wordListOne.length;
				System.out.println(oneLength);
				
				int twoLength = wordListTwo.length;
				System.out.println(twoLength);
				
				int threeLength = wordListThree.length;
				System.out.println(threeLength);
				
				
				// generate three random numbers
				int rand1 = (int) (Math.random() * oneLength);
				System.out.println(rand1);
				
				int rand2 = (int) (Math.random() * twoLength);
				System.out.println(rand2);
				
				int rand3 = (int) (Math.random() * threeLength);
				System.out.println(rand3);

				// now build a phrase
				String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

				// print out the phrase
				System.out.println("What we need is a " + phrase);
		
	}

}
