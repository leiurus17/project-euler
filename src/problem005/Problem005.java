package problem005;

/**
 * Smallest multiple
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 * 
 * @author martianworm17
 *
 */

public class Problem005 {

	public static void main(String[] args) {

		for (int x = 182397448; x <= 1000000000; x++) {
			if (x % 2 == 0) {
				System.out.print(x + ": ");
				if (isOneToTwenty(x)) {
					System.out.println(x);
					break;
				}
			}
		}

	}

	public static boolean isOneToTwenty(int value) {

		if (value % 1 == 0 && value % 3 == 0 && value % 4 == 0 && value % 5 == 0 && value % 6 == 0 && value % 7 == 0
				&& value % 8 == 0 && value % 9 == 0 && value % 10 == 0 && value % 11 == 0 && value % 12 == 0
				&& value % 13 == 0 && value % 14 == 0 && value % 15 == 0 && value % 16 == 0 && value % 17 == 0
				&& value % 18 == 0 && value % 19 == 0 && value % 20 == 0) {
			System.out.println(true);
			return true;
		}

		System.out.println(false);
		return false;
	}
}
