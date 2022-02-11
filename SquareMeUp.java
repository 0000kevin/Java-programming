package squareMeUp;

import java.util.Scanner;

/**
 * 
 */

/**
 * Week 4 challenge involving user input, loops and methods with parameter passing.
 * DRAWING A BOX
 * @author Kevin O'Shea
 *
 */
public class SquareMeUp {

	/**
	 * Ask the user for the length of the side of a box, then prompt the user for the character to user as each point on the box.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char borderChar;
		int lengthSize;
		
		System.out.println("Enter the length of the side of a box...");
		lengthSize = scanner.nextInt();
		
		System.out.println("What character do you want to build the box with?");
		borderChar = scanner.next().charAt(0);
		
		drawHorizontal(lengthSize, borderChar);
		drawSides(lengthSize, borderChar);
		drawHorizontal(lengthSize, borderChar);
		scanner.close();
	}
	
	/**
	 * Draws horizontal lines of the box using a for loop
	 * @param lengthSize - how many times the character is printed
	 * @param borderChar - which character to print
	 */
	public static void drawHorizontal(int lengthSize, char borderChar) {
		for(int i = 1; i <= lengthSize; i++) {
			System.out.print(borderChar + "  ");
		}
		System.out.println();
	}
	
	/**
	 * Draws vertical lines of box using a for loop and repeating spaces based on length size to pad out middle
	 * @param lengthSize - how many times the character is printed, also how much spacing is in center
	 * @param borderChar - which character to print
	 */
	public static void drawSides(int lengthSize, char borderChar) {
		String spacing;
		spacing = "   ";
		for(int i = 1; i <= lengthSize-2; i++) {
			System.out.println(borderChar + "  " + spacing.repeat(lengthSize-2) + borderChar);
		}
	}
}
