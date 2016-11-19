// I have solved this before but I don't have the code anymore. So I need to write the solution again.

package problem004;

public class Problem004 {

	public static void main(String[] args) {
		long loopAnswer;
		long largerPalindrome = 0;

		for (int x = 100; x <= 999; x++) {
			for (int y = 100; y <= 999; y++) {
				loopAnswer = processAnswer(x * y);

				if (loopAnswer > largerPalindrome) {
					largerPalindrome = loopAnswer;
					System.out.println(largerPalindrome);
				}

			}
		}

	}

	public static long processAnswer(long loopAnswer) {
		String answerInStringProper = Long.toString(loopAnswer);
		String answerInReverse = new StringBuffer(answerInStringProper).reverse().toString();

		if (answerInStringProper.equalsIgnoreCase(answerInReverse)) { // Palindrome
			return loopAnswer;
		}

		return 0;
	}

}
