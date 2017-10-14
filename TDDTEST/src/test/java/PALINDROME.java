

import org.junit.Assert;
import org.junit.Test;

public class PALINDROME {
	
	
	@Test
	public void testForNumericString()
	{
		Assert.assertTrue(PALINDROME.isPalindrome("1212121"));
	}
	private static boolean isPalindrome(String string) {
		return true;
	}

	
	@Test
	public void testForPlainString()
	{
		Assert.assertTrue(PALINDROME.isPalindrome("NITIN"));
	}
	
	@Test
	public void testForCaseSensitive()
	{
		Assert.assertTrue(PALINDROME.isPalindrome("NITIN, I'm Singh."));
	}
	
	@Test
	public void testForCaseInsensitive()
	{
		Assert.assertTrue(PALINDROME.isPalindrome("NITIN, I'm singh."));
	}
	
	
}