/**
 * 
 */
package stringBuilder;

/**
 * Class shows how to reverse a string - done manually with loops, or using an instance of StringBuilder using the reverse function.
 * @author Kevin O'Shea
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String palindrome = "Dot saw I was Tod";
		int length = palindrome.length();
		char[] tempCharArray = new char[length];
		char[] charArray = new char[length];
		
		System.out.println(palindrome);

		// put original string in an array of chars
		for(int loop=0;loop<length;loop++) {
			tempCharArray[loop]=palindrome.charAt(loop);
		}
		
		// reverse array of chars
		for(int loop=0;loop<length;loop++) {
			charArray[loop]=tempCharArray[length-1-loop];
		}

        // check if the original string was a palindrome
		String reversePalindrome = new String(charArray);
		System.out.println(reversePalindrome);
		
		
		if(palindrome.equalsIgnoreCase(reversePalindrome)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		
		
		
		//Reverse done with StringBuilder object
		StringBuilder sb = new StringBuilder(palindrome);
		sb.reverse();
		System.out.println(sb);
	}

}
