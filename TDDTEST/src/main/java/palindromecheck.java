

public class palindromecheck {
	
	public static boolean isPalindrome(String testString) {
		if (null == testString || "".equals(testString)) {
			return false;
		} else {
			String stringWithoutPunctuation = "";
			String reverse = "";
			String reverseWithoutPunc = removePunctuation(testString, stringWithoutPunctuation);
			return reverseWithoutPunc.length() > 0
					? reverseWithoutPunc.equalsIgnoreCase(reverseString(reverseWithoutPunc, reverse)) : false;

		}
	}

	
	public static String removePunctuation(String testString, String stringWithoutPunctuation) {

		if (testString.length() == 1) {
			return testString;
		} else {

			while (testString.length() > 0 && isSpecialChar(testString.charAt(testString.length() - 1))) {
				testString = testString.substring(0, testString.length() - 1);
			}
			if (testString.length() > 0) {
				stringWithoutPunctuation += testString.charAt(testString.length() - 1)
						+ removePunctuation(testString.substring(0, testString.length() - 1), stringWithoutPunctuation);
			}
			return stringWithoutPunctuation;
		}
	}
	
	public static boolean isSpecialChar(char ch) {
		int charCode = (int) ch;
		if (charCode < 48 || (charCode > 57 && charCode < 65) || (charCode > 90 && charCode < 97) || charCode > 122) {
			return true;
		}
		return false;
	}
	
	public static String reverseString(String str, String reverse) {

		if (str.length() == 1) {
			return str;
		} else {
			reverse += str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1), reverse);
			return reverse;
		}
	}

}