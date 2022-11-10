package Exercises;

import java.util.Scanner;

public class WordsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence;
		int placeOfLastLetter;
		int numOfSpaces = 0;
		int numOfWords;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sentence, with exactly one " +
		 "space between words:");
		sentence = in.nextLine();
		//מניית הרווחים במשפט //
		for (int i = 0 ; i < sentence.length() ; i++)
		if (sentence.charAt(i) == ' ')
		numOfSpaces++;
		numOfWords = numOfSpaces + 1;
		// מציאת מקומו של הרווח הראשון //
		if (numOfWords == 1)
		placeOfLastLetter = sentence.length()- 1;
		else
		placeOfLastLetter = sentence.indexOf(' ') - 1;
		System.out.println("The last letter of the first word is: " +
		sentence.charAt(placeOfLastLetter));
	//	כמה מילים במשפט //
		System.out.println("There are " + numOfWords + " words");
		//main
		// class HowManyWords
	}

}
