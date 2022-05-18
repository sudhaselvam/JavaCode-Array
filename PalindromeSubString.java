package dailypractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeSubString {                                                                              

	public int count1(String str) {
		String temp = "";
		StringBuffer stf;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				temp = str.substring(i, j);
				System.out.println(temp);
				if (temp.length() >= 2) {
					stf = new StringBuffer(temp);
					stf.reverse();
					if (stf.toString().compareTo(temp) == 0) {
						count++;
					}
				}
			}

		}
		System.out.println(count);
		return count;
	}

	@Test
	public void test() {
		Assert.assertEquals(count1(" this is a racecar"), 3);
	}
	@Test
	public void test1() {
		Assert.assertEquals(count1("aaa"), 1);
	}
}
