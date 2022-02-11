/**
 * 
 */
package fizzBuzz;

/**
 * FIZZ BUZZ CHALLENGE - 1 November 2021
 * Prints numbers 1-100 
 * For multiples of '3' print "Fizz" instead of the number 
 * For the multiples of '5' print "Buzz" 
 * For multiples of 3 and 5 print "Fizz Buzz"
 * @author Kevin O'Shea
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int loop = 1; loop<=100; loop++) {
			String test = "";
			
			test += (loop%3) == 0 ? "Fizz" : "";
			test += (loop%5) == 0 ? "Buzz" : "";
			
			System.out.println(test.isEmpty() ? loop : test);
		}
		
//		for(int loop = 1; loop<=100; loop++) {
//			if(loop%15==0) {
//				System.out.println("FizzBuzz");
//			} else if(loop%3==0) {
//				System.out.println("Fizz");
//			} else if(loop%5==0) {
//				System.out.println("Buzz");
//			} else if(loop%3!=0 && loop%5!=0) {
//				System.out.println(loop);
//			} 
//		}
	}

}
