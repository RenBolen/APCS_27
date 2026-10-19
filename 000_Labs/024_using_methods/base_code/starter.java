/*
 *	Author:  
 *  Date: 
*/

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

class starter {
	static long startTime = 0;
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String args[]) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		populateArrayList();
		boolean running = true;
		int plays = 0;
		System.out.println("========================================");
		System.out.println("             Typing Game");
		System.out.println("========================================");
		System.out.println("Type the sentence as fast as possible.");
		String givenSentence = "";
		while (running) {
			System.out.println();
			System.out.println("Would you like to play the typing game?");
			String choice = sc.nextLine();
			if (choice.equalsIgnoreCase("yes")) {
				System.out.println("Would you like to choose a sentence or have a random sentence chosen for you? (Choose or Random)");
				if (plays > 0) {
					System.out.println("If you would like the same sentence as before type same.");
				}
				String sentenceType = sc.nextLine();
				int answerNum = 0;
				while ((!sentenceType.equalsIgnoreCase("Choose") && !sentenceType.equalsIgnoreCase("Random") && !sentenceType.equalsIgnoreCase("same")) || answerNum == 0){
					if (!sentenceType.equalsIgnoreCase("Choose") && !sentenceType.equalsIgnoreCase("Random") && !sentenceType.equalsIgnoreCase("same")) {
						System.out.println("Please enter a valid answer.");
						sentenceType = sc.nextLine();
					}
					answerNum++;
					
					if (sentenceType.equalsIgnoreCase("Choose")) {
						System.out.println("Which sentence would you like to type? (1-100)");
						int sentenceNum = sc.nextInt();
						System.out.println("It is currently " + getTime() + ".");
						countdown();
						startTimer();
						givenSentence = getSentence(sentenceNum);
						System.out.println(givenSentence);
						sc.nextLine();
						String typedSentence = sc.nextLine();
						endTimer();
						System.out.println("========================================"); 
						System.out.println("You took " + endTimer() + " seconds.");
						System.out.println("You typed " + lettersInSentence(typedSentence) + " characters.");
						System.out.println("You typed " + wordsInSentence(typedSentence) + " words.");
						System.out.println("You made " + compareSentences(givenSentence, typedSentence) + " mistakes.");
					}
					else if (sentenceType.equalsIgnoreCase("Random")) {
						System.out.println("It is currently " + getTime() + ".");
						countdown();
						startTimer();
						givenSentence = getSentence();
						System.out.println(givenSentence);
						String typedSentence = sc.nextLine();
						endTimer();
						System.out.println("========================================"); 
						System.out.println("You took " + endTimer() + " seconds.");
						System.out.println("You typed " + lettersInSentence(typedSentence) + " characters.");
						System.out.println("You typed " + wordsInSentence(typedSentence) + " words.");
						System.out.println("You made " + compareSentences(givenSentence, typedSentence) + " mistakes.");
					}
					if (sentenceType.equalsIgnoreCase("same")) {
						System.out.println("It is currently " + getTime() + ".");
						countdown();
						startTimer();
						System.out.println(givenSentence);
						String typedSentence = sc.nextLine();
						endTimer();
						System.out.println("========================================"); 
						System.out.println("You took " + endTimer() + " seconds.");
						System.out.println("You typed " + lettersInSentence(typedSentence) + " characters.");
						System.out.println("You typed " + wordsInSentence(typedSentence) + " words.");
						System.out.println("You made " + compareSentences(givenSentence, typedSentence) + " mistakes.");
					}
				}
			}
			else if (choice.equalsIgnoreCase("no")) {
				if (plays == 0) {
					System.out.println("Thank you for running this code.");
				}
				if (plays > 0) {
					System.out.println("Thank you for playing.");
				}
				running = false;
			}
			else {
				System.out.println();
				System.out.println("Please enter another answer.");
				System.out.println();
				plays--;	
			}
			plays++;
		}

		
	}

	// This method returns the local current time as a String
	public static String getTime(){
		LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
	}

	// This method starts a clock that can be used throughout the program
	public static void startTimer(){
		startTime = System.nanoTime();
	}

	// This method stops the timer clock and returns a double of the seconds and milliseconds of the stopwatch
	public static double endTimer() throws InterruptedException{
		long endTime = System.nanoTime();
		long timeSeconds = ((endTime - startTime)/1000000);
		double decSeconds = timeSeconds/1000.0;
		return decSeconds;
	}

	// This method does a 3 second countdown and prints it to the terminal
	public static void countdown(){
		System.out.println("Starting countdown...");
		for (int i = 0; i < 3; i++) {
			System.out.println(3-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Go!");
	}

	// This method sets up a list of sentences to be called from. 
	// This should only be called once prior to getting sentences.
	private static void populateArrayList(){
		File f = new File("sentences.txt");
		try(Scanner fsc = new Scanner(f)){
			while(fsc.hasNextLine()){
				arr.add(fsc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.err.println("File not found: " + e.getMessage());
		}
	}

	// This chooses 1 of the 100 sentences in the list to return.
	public static String getSentence(){
		populateArrayList();
		int rand = (int)(Math.random()*100);
		return arr.get(rand);
	}

	// This returns the same sentence for the same integer given.
	public static String getSentence(int index){
		populateArrayList();
		return arr.get(index%100);
	}

	//  This returns the number of letters, spaces, and punctuations in a sentence.
	public static int lettersInSentence(String sent){
		return sent.length();
	}
	
	// This returns the number of words in a sentence
	public static int wordsInSentence(String sent){
		int spaceCount = 0;
		while(sent.indexOf(" ") > -1){
			spaceCount++;
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		return ++spaceCount;
	}

	// This method does a letter by letter comparison of each word and returns the number of errors.
	public static int compareSentences(String given, String typed){
		int errors = 0;
		while(given.length() > 0 && typed.length() > 0){
			if(!given.substring(0,1).equals(typed.substring(0,1)))
				errors++;
			given = given.substring(1);
			typed = typed.substring(1);
		}
		return errors;
	}

}
