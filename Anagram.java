package dailypractice;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Anagram {

	public boolean isAnagram(String s1, String s2) {

		String str1 = s1.replaceAll("\\s", "");

		String str2 = s2.replaceAll("\\s", "");

		boolean status = true;

		if (str1.length() != str2.length()) {

			status = false;
		} else {

			char[] ch1 = str1.toLowerCase().toCharArray();

			char[] ch2 = str2.toLowerCase().toCharArray();

			Arrays.sort(ch1);

			Arrays.sort(ch2);

			status = Arrays.equals(ch1, ch2);
		}
		return status;
	}

	@Test
	public void testcase() {
		Assert.assertEquals(isAnagram("rasp", "spar"), true);
	}

	@Test
	public void testcase1() {
		Assert.assertEquals(isAnagram("rasp", "spaz"), false);
	}

}
