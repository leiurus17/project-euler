package problem006;

/**
 * 
 * @author martianworm17
 *
 */

public class Problem006 {

	public static void main(String[] args) {
		int sumOfTheSquares = 0;
		int sumOfTheNumbers = 0;
		int difference = 0;

		for (int x = 1; x <= 100; x++) {

			// The sum of the squares
			sumOfTheSquares += (x * x);

			// The sum of the numbers. Get the square after the loop is done.
			sumOfTheNumbers += x;
		}

		difference = (sumOfTheNumbers * sumOfTheNumbers) - sumOfTheSquares;

		System.out.println("Difference: " + difference);

	}

}
