package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class CreditCardValidation {
	/**
	 * Return true if the card number is valid public static boolean isValid
	 * (long number) Get the result from Step 2 public static int
	 * sumOfDoubleEvenPlace(long number) Return this number if it is a single
	 * digit, otherwise, return the sum of the two digits public static int
	 * getDigit(int number) Return sum of odd-place digits in number public
	 * static int sumOfOddPlace(long number) Return true if the digit d is a
	 * prefix for number public static boolean prefixMatched(long number, int d)
	 * Return the number of digits in d public static int getSize(long d) Return
	 * the first k number of digits from number. If the number of digits in
	 * number is less than k, return number. public static long getPrefix(long
	 * number, int k)
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a credit card number as a long integer: ");
		long number = input.nextLong();
		System.out.println(number + " is " + (isValid(number) ? "valid" : "invalid"));
	}

	public static boolean isValid(long number) {
		boolean valid = (getSize(number) >= 13 && getSize(number) <= 16)
				&& (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
						|| prefixMatched(number, 6))
				&& ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

		return valid;
	}

	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 2; i >= 0; i -= 2) {
			sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
		}
		return sum;
	}

	public static int getDigit(int number) {
		if (number < 9)
			return number;
		else
			return number / 10 + number % 10;
	}

	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 1; i >= 0; i -= 2) {
			sum += Integer.parseInt(num.charAt(i) + "");
		}
		return sum;
	}

	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}

	public static int getSize(long d) {
		String num = d + "";
		return num.length();
	}

	public static long getPrefix(long number, int k) {
		if (getSize(number) > k) {
			String num = number + "";
			return Long.parseLong(num.substring(0, k));
		}
		return number;
	}

}
