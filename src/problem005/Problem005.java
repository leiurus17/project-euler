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

		if (value % 1 == 0) { // This is embarrassing
			if (value % 3 == 0) {
				if (value % 4 == 0) {
					if (value % 5 == 0) {
						if (value % 6 == 0) {
							if (value % 7 == 0) {
								if (value % 8 == 0) {
									if (value % 9 == 0) {
										if (value % 10 == 0) {
											if (value % 11 == 0) {
												if (value % 12 == 0) {
													if (value % 13 == 0) {
														if (value % 14 == 0) {
															if (value % 15 == 0) {
																if (value % 16 == 0) {
																	if (value % 17 == 0) {
																		if (value % 18 == 0) {
																			if (value % 19 == 0) {
																				if (value % 20 == 0) {
																					System.out.println(true);
																					return true;
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(false);
		return false;
	}
}
