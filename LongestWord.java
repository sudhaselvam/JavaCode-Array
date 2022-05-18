package dailypractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongestWord {

	public String longestWord(String str) {

		String[] word = str.split(" ");
		String output ="-1";

		for (int i = 0; i < word.length; i++) {
			for (int j = i+1; j < word.length; j++) {
				if (word[i].length() > word[j].length()) {

					output = word[i];

				} 

			}
		}
		return output ;
	}
	@Test
	public void testcase() {
		Assert.assertEquals(longestWord("selenium test"), "selenium");
	}

	@Test
	public void testcase1() {
		Assert.assertEquals(longestWord("automation seleniumm"), "automation");
	}
	@Test
	public void testcase2() {
		Assert.assertEquals(longestWord("hello world"), "-1");
	}
	@Test
	public void testcase3() {
		Assert.assertEquals(longestWord("java selenium test"), "selenium");
	}
	
	@Test
	public void testcase4() {
		Assert.assertEquals(longestWord("test selenium java"), "selenium");
	}
	
//	@Test
//	public void testcase5() {
//		Assert.assertEquals(longestWord("hello world test"), "-1");
//	}


}
