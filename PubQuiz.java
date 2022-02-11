/**
 * 
 */
package pubQuiz;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Kevin O'Shea
 *
 */
public class PubQuiz {

	/**
	 * PUB QUIZ CHALLENGE - 1 November 2021 User give an random question from array
	 * User responds Answer checked against answer in array User notified of outcome
	 * User asked if they want to continue
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Setting up scanner and random number generator
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();

		// Declaring the questions and answers
		String[] questions = { "Largest planet?", "Worse song ever?", "Capital of Peru?", "Roman god of War?" };
		String[] answers = { "Jupiter", "Castles in the Sky", "Lima", "Mars" };
		String userAnswer;
		Boolean playAgain = true;
		int questionNumber, asked, correct;
		asked = 0;
		correct = 0;

		// Starting the quiz
		System.out.println("General knowledge quiz...");
		try {
			do {
				// picks a random number and uses it to print question from the array
				questionNumber = rand.nextInt(questions.length);
				System.out.println(questions[questionNumber]);
				asked++;

				// User prompted to type their answer and saved to string
				System.out.println("Type your answer and hit enter...");
				userAnswer = scanner.nextLine();

				// checks if user answer if correct
				if (userAnswer.equalsIgnoreCase(answers[questionNumber])) {
					System.out.println("Correct! Well done!");
					correct++;
					System.out.println(correct + "/" + asked);
				} else {
					System.out.println("Incorrect.");
					System.out.println(correct + "/" + asked);
				}

				// user asked if they want another question
				System.out.println("Another question? Y/N");
				userAnswer = scanner.nextLine();
				if (userAnswer.equalsIgnoreCase("Y")) {
					playAgain = true;
				} else {
					playAgain = false;
				}

			} while (playAgain);
		} catch (Exception exception) {
			System.out.println("Error");
		}

		System.out.println("Thanks for playing");
		scanner.close();
	}

}
