/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * 
 * 
 */

package problem001;

import java.util.Scanner;

public class Problem01 {

	public static void main (String[] args) {
		int theAnswer = 0;
		
		System.out.print("Enter a number to be processed: ");
		Scanner readIntInput = new Scanner(System.in);
		int theInputNumber = readIntInput.nextInt();
		readIntInput.close();
		
		for(int i = 0; i < theInputNumber; i++) {
			if(i%3 == 0 || i%5==0) {
				theAnswer = theAnswer + i;
			}
		}
		
		System.out.println(theAnswer);
	}
	
}
